package home_work_2.loops;
//    1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также
//    как и на картинке (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
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
