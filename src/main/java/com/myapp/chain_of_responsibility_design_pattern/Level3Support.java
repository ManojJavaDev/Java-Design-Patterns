package com.myapp.chain_of_responsibility_design_pattern;

public class Level3Support implements SupportHandler{

    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.CRITICAL){
            System.out.print("Request will be handled by L3 Support");
        } else if (nextHandler!=null) {
            nextHandler.handleRequest(request);
        }
    }
}
