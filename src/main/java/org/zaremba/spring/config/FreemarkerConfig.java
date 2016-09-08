package org.zaremba.spring.config;

import freemarker.template.TemplateModel;
import kr.pe.kwonnam.freemarker.inheritance.BlockDirective;
import kr.pe.kwonnam.freemarker.inheritance.ExtendsDirective;
import kr.pe.kwonnam.freemarker.inheritance.PutDirective;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://github.com/kwon37xi/freemarker-template-inheritance">Freemarker Template Inheritance</a>
 *
 * @author Gorkhover D.
 * @since 2016-01-25
 */
@Configuration
public class FreemarkerConfig {

    private Map<String, TemplateModel> freemarkerLayoutDirectives() {
        Map<String, TemplateModel> freemarkerLayoutDirectives = new HashMap<>();
        freemarkerLayoutDirectives.put("extends", new ExtendsDirective());
        freemarkerLayoutDirectives.put("block", new BlockDirective());
        freemarkerLayoutDirectives.put("put", new PutDirective());
        return freemarkerLayoutDirectives;
    }

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer freemarkerConfig = new FreeMarkerConfigurer();
        freemarkerConfig.setTemplateLoaderPath(FreeMarkerProperties.DEFAULT_TEMPLATE_LOADER_PATH);
        freemarkerConfig.setDefaultEncoding("UTF-8");

        Map<String, Object> freemarkerVariables = new HashMap<>();
        freemarkerVariables.put("layout", freemarkerLayoutDirectives());

        freemarkerConfig.setFreemarkerVariables(freemarkerVariables);
        return freemarkerConfig;
    }

    @Bean
    public ViewResolver viewResolver() {
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
        viewResolver.setCache(false);
        viewResolver.setPrefix(FreeMarkerProperties.DEFAULT_PREFIX);
        viewResolver.setSuffix(FreeMarkerProperties.DEFAULT_SUFFIX);
        viewResolver.setContentType("text/html; charset=utf-8");
        return viewResolver;
    }
}
