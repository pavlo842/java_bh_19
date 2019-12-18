package by.belhard.j19.homeworks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class HomeWork03 {

    public static void main(String[] args) {

        // Задача 1

/*        int t = 48;

        String clothes = "";

        if (t < 10) {
            clothes = "Куртка";
        } else if (t > 10 && t < 15) {
            clothes = "Ветровка";
        } else if (t > 16 && t < 20) {
            clothes = "Свитер";
        } else if (t > 21 && t < 30) {
            clothes = "Майка";
        } else {
            clothes = "Ничего";
        }

        System.out.println(clothes);*/

        // Задача 2

/*         int salaryFirstPerson = 1000;

        int salarySecondPerson = 517;

        int salaryThirdPerson = 740;

       int salaryDifference = 0;

       if (salaryFirstPerson >= salarySecondPerson && salarySecondPerson >= salaryThirdPerson) {
            salaryDifference = salaryFirstPerson - salaryThirdPerson;
        } else if (salarySecondPerson >= salaryFirstPerson && salaryFirstPerson >= salaryThirdPerson) {
            salaryDifference = salarySecondPerson - salaryThirdPerson;
        } else if (salaryThirdPerson >= salaryFirstPerson && salaryFirstPerson >= salarySecondPerson) {
            salaryDifference = salaryThirdPerson - salarySecondPerson;
        } else if (salaryThirdPerson >= salarySecondPerson && salarySecondPerson >= salaryFirstPerson) {
            salaryDifference = salaryThirdPerson - salaryFirstPerson;
        } else if (salarySecondPerson >= salaryThirdPerson && salaryThirdPerson >= salaryFirstPerson) {
            salaryDifference = salarySecondPerson - salaryFirstPerson;
        } else if (salaryFirstPerson >= salaryThirdPerson && salaryThirdPerson >= salarySecondPerson) {
            salaryDifference = salaryFirstPerson - salarySecondPerson;
        } else {
            System.out.println("Nothing happened!");
        }
        System.out.println(salaryDifference);*/

/*        int salaryFirstPerson = 1000;

        int salarySecondPerson = 517;

        int salaryThirdPerson = 740;

        int min, max;
        min = salaryFirstPerson;
        if (salarySecondPerson < min)
            min = salarySecondPerson;
        max = salaryFirstPerson;
        if (salaryThirdPerson > max)
            max = salaryThirdPerson;
        System.out.println(max - min);*/



        // Задача 3
        // degree = 2 * 2 * 2

/*        int degree = 1;

        for (int i = 0; i < 3; i++) {
            degree *= 2;
        }
        System.out.print(degree);*/
/*
        int x = 2;
        int y = 10;

        double pow = Math.pow(x, y);
        System.out.println(pow);*/


        // Задача 4

/*        int startSum = 10000;

        int proc = 12;

        int years = 3;

        for (int i = 0; i < years; i++) {
            startSum += (startSum / 100) * proc;
        }
        System.out.println("Сумма вклада с учетом процентов по истечении "
                            + years + " лет при ставке " + proc
                            + " % годовых составит " + startSum + " рублей.");*/

        // Задача 5

/*        int i;
        for (i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 7 == 0))
            System.out.println(i + " ");
        }*/

        // Задача 5 доп 1

/*        int i;
        for (i = 1; i <= 100; i++) {
//            if (i % 5 == 0 ^ i % 7 == 0)
            if (((i % 5 == 0) && !(i % 7 == 0)) || ((i % 7 == 0) && !(i % 5 == 0)))
                System.out.print(i + " ");
        }*/

        // i % 5 == 0 ^ i % 7 == 0

        // Доп 2
/*
        for (i = 1; i <= 100; i++)
            if (i / 10 % 2 == 0)
                continue;
*/


        // Задача 6

/*        int[] arrNum = {1, 2, 4, 6, 8, 10, 3, 5, 7, 11};

        int sumArrNum = 0;
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
            sumArrNum += arrNum[i];
        }
        System.out.print("Сумма элементов массива = " + sumArrNum);*/


/*        int[] arrNum = {1, 2, 4, 6, 8, 10, 3, 5, 7, 11};

        int sumArrNum = 0;
        for (int digit : arrNum) {
            sumArrNum += digit;
        }
        System.out.print("Сумма элементов массива = " + sumArrNum);*/


        // Задача 7

/*        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }*/


        // Задача 8

        // Пашет но не правильно

/*        int[][] myArray = new int[4][0];
        myArray[0] = new int[]{1};
        myArray[1] = new int[2];
        myArray[2] = new int[3];
        myArray[3] = new int[4];

        int k = 1;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = k * 1;
                k++;
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }*/


        // Не пашет
/*        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[0][0] = i * 2;
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }*/

/*        int value = 1;
        int size = 4;
        int[][] array = new int[size][];
        for (int i = 0; i < size; i++) {
            array[i] = new int[i + 1];

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value *= 2;
            }
        }
        for (int[] ints: array) {
            for (int i: ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

    }

}
