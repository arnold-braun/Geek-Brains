package CatFeed;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Васька", 5, false);
        allCats[1] = new Cat("Рыжий", 30, false);
        allCats[2] = new Cat("Черныш", 10, false);
        allCats[3] = new Cat("Мурзик", 45, false);


        Plate plate = new Plate(50);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite < plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Котик " + allCat.name + " покушал!");
            } else {
                System.out.println("Котик " + allCat.name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}