package com.example;

public class TestClass {
private final String message = "Hello World!";

    public TestClass() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }
}
