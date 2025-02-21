package com.myapp.chain_of_responsibility_design_pattern;

public class Main {

    public static void main(String[] args){
        SupportHandler l1Support = new Level1Support();
        SupportHandler l2Support = new Level2Support();
        SupportHandler l3Support = new Level3Support();

        l1Support.setNextHandler(l2Support);
        l2Support.setNextHandler(l3Support);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        l1Support.handleRequest(request1);
        l2Support.handleRequest(request2);
        l3Support.handleRequest(request3);
    }
}
