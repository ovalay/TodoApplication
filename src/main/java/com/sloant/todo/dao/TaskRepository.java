package com.sloant.todo.dao;

import com.sloant.todo.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
