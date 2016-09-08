package org.zaremba.spring.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

/**
 * @author Gorkhover D.
 * @since 2016-01-25
 */
@Configuration
@EntityScan(basePackages = "org.zaremba.spring.entities")
@EnableJpaRepositories(basePackages = "org.zaremba.spring.repo")
@EnableConfigurationProperties(DataSourceProperties.class)
public class JpaConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaConfig.class);

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @PostConstruct
    public void init() {
        LOGGER.info("[init]: {}", dataSourceProperties);
    }
}
