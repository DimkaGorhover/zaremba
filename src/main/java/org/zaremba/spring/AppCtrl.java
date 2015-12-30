package org.zaremba.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gorkhover D.
 * @since 2015-12-30
 */
@Controller
public class AppCtrl {

    @RequestMapping(value = "/ping", produces = "text/plain")
    @ResponseBody
    public String ping() {
        return "pong";
    }
}
