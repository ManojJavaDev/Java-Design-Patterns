package com.myapp.composite_design_pattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("Composite Design Pattern");
        Task task = new SimpleTask("Prep Break fast");
        Task task1 = new SimpleTask("get ready for office");

        TaskList taskList = new TaskList("Project Tasks");
        taskList.addTask(task);
        taskList.addTask(task1);

        taskList.display();

    }
}
