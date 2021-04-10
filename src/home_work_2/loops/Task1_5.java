package home_work_2.loops;

public class Task1_5 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++ ) {
            for (int j = 2; j< 6; j++){
                System.out.print(j + " * " + i + " = " + j*i + "   ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 1; i < 10; i++ ) {
            for (int j = 6; j < 10; j++){
                System.out.print(j + " * " + i + " = " + j*i + "   ");
            }
            System.out.println();
        }
    }
}
