package by.belhard.j19.lessons.lesson8.checkedExceptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        Entity entity = new Entity();

        try {
            System.out.println(entity.getNewInstance());
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("FINALLY!");
        }

//        System.out.println(entity.getNewInstance());
        System.out.println("PROGA WORK !!!");
        System.out.println(new FinallyExample().getString());

    }

}
