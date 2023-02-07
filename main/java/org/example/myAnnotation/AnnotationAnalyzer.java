package org.example.myAnnotation;


import java.lang.annotation.Annotation;

public class AnnotationAnalyzer {


    public int getNumFromAnnotation(String className) throws ClassNotFoundException {
        Class randomExc = Class.forName(
                "org.example.myAnnotation." + className);
        Annotation annotation =  randomExc.getAnnotation(RandomThrow.class);
        RandomThrow randomThrow = (RandomThrow) annotation;
        return randomThrow.num();
    }
}
