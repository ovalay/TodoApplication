package com.sloant.todo.service;

import com.sloant.todo.domain.Task;

import java.util.Collection;

public interface TaskService {

    void addTask(Task t);
    Collection<Task> getAllTasks();
}
