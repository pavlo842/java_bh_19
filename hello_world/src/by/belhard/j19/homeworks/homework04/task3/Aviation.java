package by.belhard.j19.homeworks.homework04.task3;

public class Aviation {

    TypeOfAviation typeOfAviation;              // Тип авиации
    Appointment appointment;                    // Назначение
    String model;                               // Модель
    ManufacturerСompany manufacturerСompany;    // Компания производитель
    Country country;
    int yearOfIssue;                            // Год выпуска
    int vesselAge;                              // Возраст судна
    int capacityPerson;                         // Вместимость человек
    double shipWeight;                          // Масса судна
    double rangeWithoutRefueling;               // Дальность полета без дозаправки
    int maximumSpeed;                           // Максимальная скорость

    void flightTime() {
        flightTime(2.44);
    }

    void flightTime (double hoursMinutes) {
        System.out.println(model + " находится в полете " + hoursMinutes + " час/мин.");
    }

    void costTickets (double cost) {
        System.out.println("Стоимость билета, чтобы покататься на " + model + " составляет " + cost + " $.");
    }

    int growOld() {
        return  ++vesselAge;
    }

}
