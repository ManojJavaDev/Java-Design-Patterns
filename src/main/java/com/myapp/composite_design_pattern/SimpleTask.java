package com.myapp.composite_design_pattern;

public class SimpleTask implements Task{

    String title;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title=title;
    }

    @Override
    public void display() {
        System.out.println(title);
    }


    public SimpleTask(String title) {
        this.title = title;
    }
}
