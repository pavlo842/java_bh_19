package by.belhard.j19.lessons.lesson9.task1.task1_2;

public class MyRunnbleImpl implements Runnable {

    private final String name;

    public MyRunnbleImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.printf("%s: %d\n", name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
