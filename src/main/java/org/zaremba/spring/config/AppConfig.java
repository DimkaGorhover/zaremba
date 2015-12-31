package org.zaremba.spring.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gorkhover D.
 * @since 2015-12-30
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("org.zaremba.spring")
public class AppConfig {
}
