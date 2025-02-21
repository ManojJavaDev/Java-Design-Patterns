package com.myapp.chain_of_responsibility_design_pattern;

public class Request {

    private Priority priority;


    public Request(Priority priority) {
        this.priority = priority;
    }


    public Priority getPriority(){
        return priority;
    }
}
