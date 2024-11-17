package com.java14;

import com.java14.service.Service;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        service.switchExpression("start");

        service.stackTraceNullPointer();
    }
}