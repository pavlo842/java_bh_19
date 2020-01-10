package by.belhard.j19.lessons.lesson9.task1.task1_3;


public class Main {
    public static void main(String[] args) throws Exception {

        CommonObject obj = new CommonObject();

        Thread myThread = new MyThread("myThread", obj);
        Thread myThread1 = new MyThread("myThread1", obj);
        Thread myThread2 = new MyThread("myThread2", obj);

        myThread.start();
        myThread1.start();
        myThread2.start();

        myThread.run();
        myThread1.run();
        myThread2.run();

        System.out.println(obj.getCounter());

    }
}
