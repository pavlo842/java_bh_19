package by.belhard.j19.lessons.lesson9.task1.task1_1;

public class MyThread extends  Thread {

    private final String name;

    private int counter;

    public MyThread(String name) {
        this.name = name;
        this.counter = 0;
    }

    @Override
    public void run() {

        while (counter <= 5) {
            try {
                Thread.sleep(1000);
                counter++;
                System.out.printf("%s: %d\n", name, counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            System.out.println("End of " + name);
        }
    }
}
