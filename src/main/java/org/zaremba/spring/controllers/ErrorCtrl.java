package org.zaremba.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author Gorkhover D.
 * @since 2016-01-05
 */
@Controller
@ControllerAdvice
public class ErrorCtrl {

    @ExceptionHandler
    @ResponseBody
    public String error(Exception e) {
        StringWriter string = new StringWriter();
        PrintWriter writer = new PrintWriter(string);
        writer.append("<pre>");
        e.printStackTrace(writer);
        writer.append("<pre>");
        return string.toString();
    }
}
