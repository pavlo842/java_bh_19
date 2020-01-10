package by.belhard.j19.lessons.lesson9.task1.task1_3;

public class MyThread extends Thread {

    private final CommonObject obj;

    public MyThread(String name, CommonObject obj) {
        super(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300000; i++) {
            obj.inc();
        }
    }
}
