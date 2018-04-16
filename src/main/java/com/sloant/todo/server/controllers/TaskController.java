package com.sloant.todo.server.controllers;

import com.sloant.todo.com.sloant.todo.service.TaskService;
import com.sloant.todo.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping("/addTask")
    public Task addTask(String name, String priority) {
        Task t = new Task(name, priority);
        taskService.addTask(t);
        return t;
    }

    @RequestMapping("/getAllTasks")
    public List getAllTasks (){
        return new ArrayList(taskService.getAllTasks());
    }
}
