package by.belhard.j19.lessons.lesson8.checkedExceptions;

public class FinallyExample {

    public String getString() {

        try {
            throw new Exception();
        } catch (Exception e) {
            return "exception";
        } finally {
            return "finally";
        }

    }

}
