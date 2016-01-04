package org.zaremba.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Gorkhover D.
 * @since 2016-01-05
 */
@Controller
@RequestMapping("/page")
public class PageCtrl {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "page");
        model.addAttribute("message", "Hello Page!");
        return "index";
    }
}
