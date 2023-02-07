package org.example.myAnnotation;

@RandomThrow(num = 3)
public class RandomException extends Exception{

    public RandomException(String message) {
        super(message);
    }
}
