package HomeWork3;

import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        arr4(4,4);

    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }

    public static void fillArray() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static void changeArray() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] = arr2[i] * 2;
            {
                System.out.println(i + "-" + arr2[i] + " ");
            }
        }
    }
// в следующем задании не уверен до конца...
    public static void fillDiagonal() {
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                if (i == j) {
                    arr3[i][j] = 1;
                }{
                System.out.print(arr3[i] + " ");
            }
            {
                System.out.println();
            }
        }
    }
// Так я и не понял как это сделать, дождусь разбора, да непростая тема. Вроде на лекциях все легко и понятно
//    а как только сел делать...
//    public static int[] arr4(int len, int initialValue) {
//        int arr4 = len + initialValue;
//        for (; )
//        return arr4;
//        }
    }
