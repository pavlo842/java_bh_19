package by.belhard.j19.homeworks.homework04.task1;

import java.time.YearMonth;

public class Main {

    public static void main(String[] args) {

        int year = YearMonth.now().getYear();

        Address mihajlovskaya = new Address();
        mihajlovskaya.street = "Михайловская";
        mihajlovskaya.houseNumber = 145;

        Building building = new Building();
        building.appointmentBuilding = AppointmentBuilding.HOUSE;
        building.address = mihajlovskaya;
        building.numberOfFloors = 125;
        building.elevator = Elevator.NO;
        building.constructionMaterial = ConstructionMaterial.MONOLITH;
        building.yearOfConstruction = 1936;

        System.out.println(building.appointmentBuilding.toString() + " расположенный по адресу:" +
                           building.address + " построен в " + building.yearOfConstruction + "г.," + " конструкция здания " +
                           building.constructionMaterial.toString() + " количество этажей " + building.numberOfFloors + "." +
                            " К сожалению " + building.elevator.toString() + " так как дому уже " +
                           (year - building.yearOfConstruction) + " года!");

    }

}
