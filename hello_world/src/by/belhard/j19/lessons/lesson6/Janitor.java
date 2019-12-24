package by.belhard.j19.lessons.lesson6;

public class Janitor extends Employee {

    public Janitor(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Janitor{}" + super.toString();
    }
}
