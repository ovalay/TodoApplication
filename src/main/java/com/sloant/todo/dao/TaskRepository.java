package com.sloant.todo.dao;

import com.sloant.todo.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findAllByPriority(String priority);

}
