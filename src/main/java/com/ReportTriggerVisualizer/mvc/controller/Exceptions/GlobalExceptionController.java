package com.ReportTriggerVisualizer.mvc.controller.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllErrors(Exception ex) {

        ModelAndView model = new ModelAndView("/error");

        model.addObject("errCode", "500 Internal Server error");
        model.addObject("errMsg", "Cannot connect to server");

        return model;
    }
}
