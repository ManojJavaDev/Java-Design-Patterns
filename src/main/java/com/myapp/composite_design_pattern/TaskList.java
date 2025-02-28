package com.myapp.composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task{

    String title;

    List<Task> taskList;


    public TaskList(String title) {
        this.title = title;
        this.taskList = new ArrayList<>();
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title=title;
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public void removeTask(Task task){
        taskList.remove(task);
    }

    @Override
    public void display() {
        System.out.println("Task List: " + title);
        for(Task task : taskList){
            task.display();
        }

    }
}
