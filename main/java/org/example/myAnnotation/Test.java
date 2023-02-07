package org.example.myAnnotation;


public class Test {


    public static void main(String[] args) throws RandomException, ClassNotFoundException {

        AnnotationAnalyzer annotationAnalyzer = new AnnotationAnalyzer();
        int numFromAnnotation = annotationAnalyzer.getNumFromAnnotation("RandomExceptionTwo");

        RamdomArea ramdomArea = new RamdomArea();
        ramdomArea.randomThrowException(numFromAnnotation);
    }


}
