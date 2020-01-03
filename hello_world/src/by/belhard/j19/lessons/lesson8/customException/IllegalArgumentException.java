package by.belhard.j19.lessons.lesson8.customException;

public class IllegalArgumentException extends Exception {

    public IllegalArgumentException(int value) {
        super ("value " + value);
    }
}
