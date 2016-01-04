package org.zaremba.spring;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import org.zaremba.spring.config.AppConfig;

import static org.testng.Assert.*;

/**
 * Test for {@link App}
 *
 * @author Gorkhover D.
 * @since 2016-01-05
 */
@SpringApplicationConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class AppTest extends AbstractTestNGSpringContextTests {

    @Test
    public void testName() throws Exception {
        System.out.println("Hello Test!");
    }
}