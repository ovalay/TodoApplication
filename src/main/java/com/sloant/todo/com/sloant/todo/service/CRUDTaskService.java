package com.sloant.todo.com.sloant.todo.service;

import com.sloant.todo.domain.Task;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class CRUDTaskService implements TaskService {


    @Override
    public void addTask(Task t) {
        System.out.println("Adding task");
    }

    @Override
    public Collection<Task> getAllTasks() {
        System.out.println("getting all tasks");
        return Arrays.asList(new Task("dummy", "1"), new Task("dummm2", "2"));
    }
}
