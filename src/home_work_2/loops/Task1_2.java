package home_work_2.loops;


public class Task1_2 {
    public static void main(String[] args) {

        if (!checkLetter(args[0])) {
            if (Double.parseDouble(args[0]) % 1 == 0) {
                int x = Integer.parseInt(args[0]);
                System.out.println("arg = " + x);
                int product = 1;
                int count = 0;
                int temp = x;

                while (temp != 0) {
                    temp = temp / 10;
                    count++;
                }

                temp = count - 1;
                int[] numbers = new int[count];

                while (x != 0) {
                    int remainder = x % 10;
                    x = x / 10;
                    numbers[temp--] = remainder;
                    product = product * remainder;
                }

                for (int i = 0; i < count; i++) {
                    if (i < count - 1) {
                        System.out.print(numbers[i] + " * ");
                    } else
                        System.out.print(numbers[i] + " = ");
                }
                System.out.print(product);
            } else
                System.out.println("Число не целое");
        } else
            System.out.println("Введено не число");
    }

    public static boolean checkLetter(String arg) {
        boolean isLetter = false;
        for (int i = 0; i < arg.length(); i++) {
            if (!Character.isLetter(arg.charAt(i))) {
                isLetter = false;
            } else if (Character.isLetter(arg.charAt(i))) {
                isLetter = true;
                break;
            }
        }
        return isLetter;
    }
}