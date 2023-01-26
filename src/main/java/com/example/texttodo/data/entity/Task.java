package com.example.texttodo.data.entity;

import javax.persistence.Entity;

@Entity
public class Task extends AbstractEntity {

    private String todoString;
    private Boolean taskComplete=false;
    public String getTodoString() {
        return todoString;
    }

    public void setTodoString(String todoString) {
        this.todoString = todoString;
    }

    public Boolean getTaskComplete() {
        return taskComplete;
    }

    public void setTaskComplete(Boolean taskComplete) {
        this.taskComplete = taskComplete;
    }
}
