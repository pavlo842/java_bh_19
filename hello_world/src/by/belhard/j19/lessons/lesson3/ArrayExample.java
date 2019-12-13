package by.belhard.j19.lessons.lesson3;

public class ArrayExample {

    public static void main(String[] args) {

//    int[] inst = new int[5];

        int[] instArray = {0, 11, -2, 21, 5};

        for (int i = 0; i < instArray.length; i++) {
//            int digit = instArray[i];

            if (i % 2 != 0)
                instArray[i] += instArray[i];
//            System.out.println(instArray[i]);

            for (int digit : instArray) {

                System.out.print(digit + " ");
            }
            System.out.println();
        }


            // создание многомерных массивов
        /*
        int[][] arrayNew = new int[][];

        arrayNew[0] = new int[4];
        errayNew[1] = new int[]{0, 15, 2};
        arrayNew[2] = { arrayNew[2][0], 6};*/
    }

}
