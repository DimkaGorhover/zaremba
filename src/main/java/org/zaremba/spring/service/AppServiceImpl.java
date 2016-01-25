package org.zaremba.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.annotation.PostConstruct;

/**
 * @author Gorkhover D.
 * @since 2015-12-31
 */
@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private Jedis jedis;

    @PostConstruct
    public void injectTestData() {
        jedis.set("result", "simple result");
    }

    @Override
    public String getResult() {
        return jedis.get("result");
    }
}
