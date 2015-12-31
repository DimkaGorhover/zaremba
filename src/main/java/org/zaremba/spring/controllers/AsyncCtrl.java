package org.zaremba.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

/**
 * @author Gorkhover D.
 * @since 2015-12-31
 */
@Controller
@RequestMapping("/async")
public class AsyncCtrl {

    @RequestMapping
    @ResponseBody
    public Callable<String> index() {
        return new Callable<String>() {
            @Override
            public String call() {
                return "Async Hello World!";
            }
        };
    }

    @RequestMapping("/thread")
    @ResponseBody
    public Callable<String> thread() {
        return new Callable<String>() {
            @Override
            public String call() {
                return "Thread name: " + Thread.currentThread().getName();
            }
        };
    }
}
