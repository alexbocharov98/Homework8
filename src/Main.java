import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task1,2");

        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < integer.length; i++) {
            if (i == integer.length - 1) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(integer[i] + ", ");
        }
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumber.length; i++) {
            if (i == fractionalNumber.length - 1) {
                System.out.println(fractionalNumber[i]);
                break;
            }
            System.out.print(fractionalNumber[i] + ", ");
        }
        byte[] myMassiv = {1, 2, 3, 4, 5};
        for (int i2 = 0; i2 < myMassiv.length; i2++) {
            if (i2 == myMassiv.length - 1) {
                System.out.println(myMassiv[i2]);
                break;
            }
            System.out.print(myMassiv[i2] + ", ");
        }
        System.out.println("task3");

        for (int i4 = integer.length - 1; i4 >= 0; i4--) {
            if (i4 < 0) {
                System.out.print(integer [i4]);
                break;
            }
            System.out.print(integer[i4] + ", ");
        }
        System.out.println();

        for (int i1 = fractionalNumber.length - 1; i1 >= 0; i1--) {
            if (i1 < 0) {
                System.out.println(fractionalNumber[i1]);
                break;
            }
            System.out.print(fractionalNumber[i1] + ", ");
        }
        System.out.println();
    

        for (int i2 = myMassiv.length - 1; i2 >= 0; i2--) {
            if (i2 < 0) {
                System.out.println(myMassiv[i2]);
                break;
            }
            System.out.print(myMassiv[i2] + ", ");
        }
        System.out.println();


        System.out.println("task4");

        for (int i = 0; i < 3; i++) {
            if (integer[i] % 2 != 0)
                integer[i] = integer[i]++;
            {
            }
        }
        System.out.println(Arrays.toString(integer));
    }
}