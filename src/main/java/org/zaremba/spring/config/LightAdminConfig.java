package org.zaremba.spring.config;

import org.lightadmin.api.config.LightAdmin;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * @author Gorkhover D.
 * @since 2016-07-08
 */
@Configuration
@Order(HIGHEST_PRECEDENCE)
@ComponentScan("org.zaremba.spring.admin")
public class LightAdminConfig extends SpringBootServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        LightAdmin.configure(servletContext)
                .basePackage("org.lightadmin.boot.administration")
                .baseUrl("/admin")
                .security(false)
                .backToSiteUrl("http://lightadmin.org");

        super.onStartup(servletContext);
    }
}
