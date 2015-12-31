package org.zaremba.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zaremba.spring.service.AppService;

/**
 * @author Gorkhover D.
 * @since 2015-12-31
 */
@Controller
@RequestMapping("/service")
public class ServiceCtrl {

    @Autowired
    private AppService appService;

    @RequestMapping
    @ResponseBody
    public String index() {
        return "Hello from service layer!";
    }

    @RequestMapping("/result")
    @ResponseBody
    public String result() {
        return appService.getResult();
    }
}
