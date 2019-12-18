package by.belhard.j19.homeworks.homework04.task3;

public class Main {

    public static void main(String[] args) {

        Country usa = new Country();
        usa.countryName = "Chicago, USA, Illinois";
        usa.zipCode = 60601;

        Country eu = new Country();
        eu.countryName = "Toulouse, France";
        eu.zipCode = 31100;

        Aviation airBoeing = new Aviation();
        airBoeing.appointment = Appointment.CIVILAVIATION;
        airBoeing.manufacturerСompany = ManufacturerСompany.BOEING;
        airBoeing.model = "Boeing 747";
        airBoeing.country = usa;
        airBoeing.typeOfAviation = TypeOfAviation.AIRPLANE;

        Aviation airAirbus = new Aviation();
        airAirbus.appointment = Appointment.CIVILAVIATION;
        airAirbus.manufacturerСompany = ManufacturerСompany.AIRBUS;
        airAirbus.model = "Airbus A320";
        airAirbus.country = eu;
        airAirbus.typeOfAviation = TypeOfAviation.AIRPLANE;

        System.out.println("Две модели самолетов " + airAirbus.model +
                            " и " + airBoeing.model + " самые популярные в мире!");

        airBoeing.flightTime(2.48);
        airAirbus.costTickets(500.56);


    }

}
