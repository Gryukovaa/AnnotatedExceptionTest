package org.example.myAnnotation;

public class RamdomArea {

    public void randomThrowException(int num) throws RandomException {
        // генерю рандомное число
        int randomInt = (int) ((Math.random() * 3) + 1);
        System.out.println(randomInt);
        // если оно совпадает с аннотированным числом эксепшона - бросаем искл
        if(randomInt == num) {
            throw new RandomException("This is a random exception!!!!!!!!");
        }
        System.out.println("It's ok!");

        // если не совпадает ничего не происходит


    }
}
