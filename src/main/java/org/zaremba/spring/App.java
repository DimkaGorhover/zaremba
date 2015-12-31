package org.zaremba.spring;

import org.springframework.boot.SpringApplication;
import org.zaremba.spring.config.AppConfig;

/**
 * @author Gorkhover D.
 * @since 2015-12-30
 */
public class App {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
