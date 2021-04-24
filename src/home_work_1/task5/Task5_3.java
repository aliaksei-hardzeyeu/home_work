package home_work_1.task5;

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        final String name2 = "Вася";
        final String name3 = "Анастасия";

        switch (name) {
            case name2:
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case name3:
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("А ты кто?");
        }
        sc.close();
    }
}
