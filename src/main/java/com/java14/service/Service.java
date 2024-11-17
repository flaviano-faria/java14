package com.java14.service;

public class Service {

    public void switchExpression(String event){
        switch (event){
            case "start", "restart"->{
                System.out.println("loading");
            }
            case "stop", "pause"->{
                System.out.println("not loading");
            }
            default -> throw new IllegalStateException("Unexpected value: " + event);
        }
    }

    public void stackTraceNullPointer(){
        String name = null;
        try {
            // This will cause a NullPointerException
            System.out.println(name.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
