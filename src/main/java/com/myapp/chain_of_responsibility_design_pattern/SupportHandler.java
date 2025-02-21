package com.myapp.chain_of_responsibility_design_pattern;

public interface SupportHandler {

    public void setNextHandler(SupportHandler nextHandler);
    public void handleRequest(Request request);

}
