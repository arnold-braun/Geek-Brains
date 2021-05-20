package HomeWork1;

/**
 *   JavaDoc comment
 */

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int c = a + b;

        if (c >= 0){
            System.out.println("Сумма положительная");
        } if (c < 0){
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {

        int value = 14;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
                System.out.println("Желтый");
            }else{
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {

        int a = 7;
        int b = 9;

        if (a >= b) {
            System.out.println(a >= b);
        } else {
            System.out.println(a < b);
        }
    }
}
