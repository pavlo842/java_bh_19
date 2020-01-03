package by.belhard.j19.lessons.lesson8.io;

import java.io.*;

public class SonsoleInputExample {

    public static void main(String[] args) {

        BufferedReader rdr =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("example.ttt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        String line = "";

        while (!rdr.equals("exit"));
            try {
                line = rdr.readLine();
                writer.write(line);
                writer.newLine();
            } catch (IOException e) {
                System.out.println("ERROR");
            }

        try {
            writer.flush();
            writer.close();
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
