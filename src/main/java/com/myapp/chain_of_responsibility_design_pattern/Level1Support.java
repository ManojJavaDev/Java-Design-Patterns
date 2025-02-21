package com.myapp.chain_of_responsibility_design_pattern;

public class Level1Support implements SupportHandler{

    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
       this.nextHandler=nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.BASIC){
            System.out.println("Request Handled by L1 Support");
        }else{
            nextHandler.handleRequest(request);
        }
    }


}
