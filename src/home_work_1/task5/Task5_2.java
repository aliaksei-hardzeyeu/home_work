package home_work_1.task5;

import java.util.Objects;
import java.util.Scanner;


public class Task5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name1 = sc.nextLine();

        String name2 = "Вася";
        String name3 = "Анастасия";
        boolean checkIsName1 = Objects.equals(name1, name2);
        boolean checkIsName2 = Objects.equals(name1, name3);

        if (checkIsName1) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else if (checkIsName2) {
            System.out.println("Я тебя так долго ждал");
        } else System.out.println("А ты кто?");

        sc.close();
    }
}

