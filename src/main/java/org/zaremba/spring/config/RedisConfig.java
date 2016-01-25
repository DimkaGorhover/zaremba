package org.zaremba.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

import java.net.URI;

/**
 * @author Gorkhover D.
 * @since 2016-01-25
 */
@Configuration
public class RedisConfig {

    @Bean(destroyMethod = "close")
    public Jedis jedis() {
        URI uri = URI.create("redis://localhost:6379/0");
        JedisShardInfo info = new JedisShardInfo(uri);
        Jedis jedis = new Jedis(info);

        jedis.ping();

        return jedis;
    }
}
