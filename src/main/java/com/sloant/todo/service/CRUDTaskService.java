package com.sloant.todo.service;

import com.sloant.todo.dao.TaskRepository;
import com.sloant.todo.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CRUDTaskService implements TaskService {

    @Autowired
    private TaskRepository repository;

    @Override
    public void addTask(Task t) {
        repository.save(t);
    }

    @Override
    public Collection<Task> getAllTasks() {
        List<Task> results = new ArrayList<>();
        repository.findAll().forEach(results::add);
        return results;
    }

    @Override
    public Collection<Task> getAllTasksByPriority(String priority) {
        return repository.findAllByPriority(priority);
    }
}
