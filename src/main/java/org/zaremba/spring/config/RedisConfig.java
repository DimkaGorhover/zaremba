package org.zaremba.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;
import redis.embedded.RedisServer;

import java.net.URI;

/**
 * @author Gorkhover D.
 * @since 2016-01-25
 */
@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class RedisConfig {

    @Autowired
    private RedisProperties redisProperties;

    @Bean(initMethod = "start", destroyMethod = "stop")
    public RedisServer embeddedRedisServer() {
        return RedisServer.builder()
                .port(redisProperties.getPort())
                .build();
    }

    @Bean(initMethod = "ping", destroyMethod = "close")
    @DependsOn("embeddedRedisServer")
    public Jedis jedis() {
        URI uri = URI.create(String.format("redis://%s:%d/%d",
                redisProperties.getHost(),
                redisProperties.getPort(),
                redisProperties.getDatabase()));
        return new Jedis(new JedisShardInfo(uri));
    }
}
