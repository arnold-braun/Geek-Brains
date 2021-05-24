package HomeWork2;

public class hw2 {
    public static void main(String[] args) {
        System.out.println(twoNumbers(10,11));
        positiveOrNegative();
        System.out.println(isNegative(-1));
        printWordNTimes("test", 5);
    }

    public static boolean twoNumbers(int a, int b) {
        int sum = a + b;
        if(sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(){
        int a = 0;
        if (a>=0) {
            System.out.println(" Число положительное ");
        } else if (a<0){
            System.out.println(" Число отрицательное ");
        }
    }

    public static boolean isNegative(int a) {
        if (a<0) {
            return true;
        } else {
            return false;
        }
    }
// С этим (4) заданием не просто было, нет уверенности что правильно на 100%
    public static void printWordNTimes(String word, int i) {
        for (i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
// посмотрел в интернете решение задания №5 и понял что там деление по модулю %, но сам бы не разобрался,
//но решение посмотрел ради интереса.