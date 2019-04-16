package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        int one = 1;
        int zero = 0;
        int result = one / 0;
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
