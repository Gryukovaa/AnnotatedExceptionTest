package org.example.myAnnotation;

@RandomThrow(num = 2)
public class RandomExceptionTwo extends Exception{

    public RandomExceptionTwo(String message) {
        super(message);
    }
}
