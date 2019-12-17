package by.belhard.j19.lessons.lesson4;

public class Main {

    public static void main(String[] args) {

        Country brazil = new Country();
        brazil.title = "brazil";
        brazil.zipCode = 123456;

        Person alfredo = new Person();

        alfredo.name = "Alfredo";
        alfredo.age = 21;
        alfredo.country = brazil;
        alfredo.sex = Sex.MALE;

        Person tereza = new Person();
        tereza.name = "Tereza";
        tereza.age = 25;
        tereza.country = brazil;
        tereza.sex = Sex.FEMALE;

//        System.out.println(tereza.name);
//        System.out.println(alfredo.country.title);

        alfredo.walk();
//        alfredo.eat("Brokkoli");
//        int newAge = alfredo.growOld();
//        System.out.println(newAge);
//        System.out.println(alfredo.growOld());

        System.out.println(alfredo);

    }
}
