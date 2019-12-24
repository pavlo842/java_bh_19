package by.belhard.j19.lessons.lesson6;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Vasyan", 18, "lopata");
        Manager manager = new Manager("Bidlo", 98, "123456789");

        worker.smoke();
        System.out.println(worker.toString());

        manager.doWork();
        System.out.println(manager.toString());
        manager.drinkCoffee();

        doWork(new Janitor("Jan", 10));

    }

    public static void doWork(Employee employee) {
        employee.doWork();
    }

}
