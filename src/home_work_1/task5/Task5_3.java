package home_work_1.task5;

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("А ты кто?");
        }
    }
}
