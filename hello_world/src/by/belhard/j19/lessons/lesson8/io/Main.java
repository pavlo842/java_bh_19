package by.belhard.j19.lessons.lesson8.io;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("exampleInput.ttt");

        BufferedWriter wrt;

        InputStream inputStream = null;

        try {

            wrt = new BufferedWriter(new FileWriter(inputFile));

            wrt.write("987456321");
            wrt.newLine();
            wrt.write("gjhsdgafsdh");
            wrt.flush();
            wrt.close();

            inputStream = new FileInputStream(inputFile);
            while (inputStream.available() > 0) {
                System.out.println((char)inputStream.read());
            }
        } catch (IOException e) {
            System.out.println("ERROR");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        System.out.println("END");

    }

}
