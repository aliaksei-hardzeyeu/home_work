package home_work_2.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(testScan());
        System.out.println("-----------");
        System.out.println(testScan());
    }

    public static int testScan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedi a");
        int a = Integer.parseInt(scanner.nextLine());

        return a;
    }
}




