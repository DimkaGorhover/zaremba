package org.zaremba.spring.config;

import io.undertow.Undertow;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.concurrent.TimeUnit;

/**
 * @author Gorkhover D.
 * @since 2015-12-30
 */
@Configuration
@EnableAutoConfiguration(exclude = {
        FreeMarkerAutoConfiguration.class,
        RedisAutoConfiguration.class
})
@EnableWebMvc
@ComponentScan("org.zaremba.spring")
public class AppConfig {

    private final int ioThreads = Runtime.getRuntime().availableProcessors();
    private final int workerThreads = 2 * Runtime.getRuntime().availableProcessors();

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
        factory.setPort(8080);
        factory.setSessionTimeout(10, TimeUnit.MINUTES);
        factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
            @Override
            public void customize(Undertow.Builder builder) {
                builder.setIoThreads(ioThreads);
                builder.setWorkerThreads(workerThreads);
                builder.setDirectBuffers(true);
            }
        });
        return factory;
    }
}
