import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        /*int b=arrInt[0];
        int c=arrInt[1];
        int d=arrInt[2];*/
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);

        double[] arrDouble = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.println(arrDouble[i]);
        }

        float[] arrFloat = {32.234f, 40.678f, 12f, 5f};
        for (int l = 0; l < arrFloat.length; l++) {
            System.out.println(arrFloat[l]);
        }

        System.out.println(arrInt[0] + ", " + arrInt[1] + ", " + arrInt[2]);
        System.out.println(arrDouble[0] + ", " + arrDouble[1] + ", " + arrDouble[2]);
        System.out.println(arrFloat[0] + ", " + arrFloat[1] + ", " + arrFloat[2] + ", " + arrFloat.length);


        for (int i = arrInt.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrInt[i]);//"%s ",
            } else {
                System.out.print(arrInt[i] + ", ");//"%s, ",
            }
        }

        System.out.println();
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrDouble[i]);//"%s ",
            } else {
                System.out.print(arrDouble[i] + ", ");//"%s, ",
            }

        }

        System.out.println();
        for (int i = arrFloat.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrFloat[i]);//"%s ",
            } else {
                System.out.print(arrFloat[i] + ", ");//"%s, ",
            }
        }

        System.out.println();
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i] += 1;
                System.out.print(arrInt[i] + " ");
            }
        }
    }
}