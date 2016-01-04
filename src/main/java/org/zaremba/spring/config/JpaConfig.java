package org.zaremba.spring.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Gorkhover D.
 * @since 2016-01-25
 */
@Configuration
@EntityScan(
        basePackages = {
                "org.zaremba.spring.entities"
        })
@EnableJpaRepositories(
        basePackages = {
                "org.zaremba.spring.repo"
        })
public class JpaConfig {
}
