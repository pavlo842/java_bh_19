package by.belhard.j19.homeworks.homework04.task2;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        player.printInfo();
        player.move(3, 4);
        player.printInfo();
        player.move(-3, -4);
        player.printInfo();

    }

}
