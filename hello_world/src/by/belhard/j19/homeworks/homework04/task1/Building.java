package by.belhard.j19.homeworks.homework04.task1;

import java.time.YearMonth;

public class Building {

    public static void main(String[] args) {
        int year = YearMonth.now().getYear();

        Address address;
        AppointmentBuilding appointmentBuilding;
        ConstructionMaterial constructionMaterial;
        Elevator elevator;
        int numberOfFloors;
        int yearOfConstruction = 1975;


//        int year = YearMonth.now().getYear();
        System.out.println(year - yearOfConstruction);

    }

}
