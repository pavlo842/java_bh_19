package by.belhard.j19.lessons.lesson9.task1.task1_1;

import by.belhard.j19.lessons.lesson9.task1.task1_2.MyRunnbleImpl;

public class Main {
    public static void main(String[] args) throws RuntimeException, InterruptedException {

        Thread myThread = new MyThread("GIVEN");
        Thread myThread1 = new MyThread("GIVEN-1");
        Thread myThread2 = new Thread(new MyRunnbleImpl("My runnable"));

        myThread2.setDaemon(true);
//        myThread.run();
        myThread.start(); // запуск потока
        myThread1.start();
        myThread2.start();
//        System.out.println("End myThread");

        myThread.join();
        myThread1.join();

//        throw new RuntimeException();

    }
}
