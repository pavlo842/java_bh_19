package by.belhard.j19.lessons.lesson6;

public class Employee {

    private String name;

    private int age;

//    public Employee() {
//
//    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doWork() {
        System.out.println("Work something");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
