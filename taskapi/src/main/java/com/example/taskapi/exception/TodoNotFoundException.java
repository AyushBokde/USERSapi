package com.example.taskapi.exception;



public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(Long id) {
        super("By Ayush."
        		+ "Todo with ID " + id + " not found.");
    }
}

