package com.contest;

public class NegativeInputException extends RuntimeException{
    public NegativeInputException(){
        super("Invalid input - contains negative values");
    }
}
