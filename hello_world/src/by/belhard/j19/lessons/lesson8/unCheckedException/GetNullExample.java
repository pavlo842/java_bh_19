package by.belhard.j19.lessons.lesson8.unCheckedException;

public class GetNullExample {

    private String object;

    public GetNullExample(String object) {
        this.object = object;
    }

    public String GetLowercase() {

        String result;

        try {
            result = object.toLowerCase();
        } catch (NullPointerException e) {
            result = "fuck";
        }
        return result;
    }

}
