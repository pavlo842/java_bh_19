package by.belhard.j19.lessons.lesson8.customException;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {

          try {
              printPositiveInt(-5);
          } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
          }

          printPositiveInt(-4);

    }

    private static void printPositiveInt(int value) throws IllegalArgumentException {

        if (value < 0) {
            throw new IllegalArgumentException(value);

        }

    }

}
