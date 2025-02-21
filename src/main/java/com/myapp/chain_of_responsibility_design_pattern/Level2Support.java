package com.myapp.chain_of_responsibility_design_pattern;

public class Level2Support implements SupportHandler{

    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public void handleRequest(Request request) {

        if(request.getPriority()==Priority.INTERMEDIATE){
            System.out.println("L2 will handle the request");
        }else if(nextHandler!=null) {
            nextHandler.handleRequest(request);
        }

    }
}
