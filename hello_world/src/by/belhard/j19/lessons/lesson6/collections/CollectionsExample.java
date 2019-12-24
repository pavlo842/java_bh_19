package by.belhard.j19.lessons.lesson6.collections;

import by.belhard.j19.lessons.lesson6.Employee;
import by.belhard.j19.lessons.lesson6.Manager;
import by.belhard.j19.lessons.lesson6.Worker;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionsExample {

    public static void main(String[] args) {

        Employee employee1 = new Worker("Vasyan", 19, "pig");
        Employee employee2 = new Worker("Igoryan", 49, "pig-ag");
        Employee employee3 = new Manager("KaVasyan", 29, "pig-1");

        ArrayList<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.remove(0);

        
    }

}
