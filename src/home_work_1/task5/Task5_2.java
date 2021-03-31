package home_work_1.task5;

import java.util.Objects;
import java.util.Scanner;

// вопрос по коду - если не вводить переменную name, а писать везде sc.nextLine() то код не работает

public class Task5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        if (Objects.equals(name,"Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name,"Анастасия")) {
            System.out.println("Я тебя так долго ждал");

        } else System.out.println("А ты кто?");

        sc.close();
    }
}

