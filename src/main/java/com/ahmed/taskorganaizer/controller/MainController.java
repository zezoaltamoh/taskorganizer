package com.ahmed.taskorganaizer.controller;

import com.ahmed.taskorganaizer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ahmed on 1/7/2017.
 */
@Controller
public class MainController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String home(HttpServletRequest request){
        request.setAttribute("tasks", taskService.findAll());
        return "index";
    }
}
