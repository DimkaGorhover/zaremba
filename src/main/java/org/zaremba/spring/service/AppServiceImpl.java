package org.zaremba.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author Gorkhover D.
 * @since 2015-12-31
 */
@Service
public class AppServiceImpl implements AppService {
    @Override
    public String getResult() {
        return "simple result";
    }
}
