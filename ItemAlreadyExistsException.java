package com.harshil.expensetracker.exception;

public class ItemAlreadyExistsException extends Exception{

    public ItemAlreadyExistsException(String message)
    {
        super(message);
    }
}
