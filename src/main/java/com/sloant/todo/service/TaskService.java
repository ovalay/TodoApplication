package com.sloant.todo.service;

import com.sloant.todo.domain.Task;

import java.util.Collection;

public interface TaskService {

    Task addTask(Task t);
    Collection<Task> getAllTasks();

    Collection<Task> getAllTasksByPriority(String priority);
}
