package com.example.task07;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try {
            processor.process();
        } catch (IllegalArgumentException e){
            return UNCHECKED;
        } catch (Exception e) {
            return CHECKED;
        }
        return NONE;
    }
}