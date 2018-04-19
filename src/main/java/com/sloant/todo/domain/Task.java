package com.sloant.todo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String priority;

    protected Task() {

    }

    public Task(String name, String priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }


    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
