package by.belhard.j19.lessons.lesson5.random;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {

        Random random = new Random();

        random.nextInt();

//        for (int i = 100; i < 150; i++) {
//            System.out.println(random.nextInt(150));
//            System.out.println(random.ints(100, 150));
//        }

/*        int i = 100 + random.nextInt(51);
        System.out.println(i);*/
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

    }

}
