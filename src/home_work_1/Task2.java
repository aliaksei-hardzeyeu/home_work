package home_work_1;

public class Task2 {
    public static void main(String[] args) {
        //        2.1 5 + 2 / 8 = 5.25
        double x = 5.0 + 2.0/8.0;
        System.out.println("2.1.  5+2/8 = " + x);

        //         2.2 (5 + 2) / 8 = 0.875
        x = (5.0+2.0)/8.0;
        System.out.println("2.2.  (5.0+2.0)/8.0 = " + x);
        //         2.3 (5 + 2++) / 8 = 0.875
        double a = 2.0;
        x = (5 + (a++))/8;
        System.out.println("2.3.  (5+ 2++)/8 = " + x);
        //         2.4 (5 + 2++) / --8 = 1
        a = 2.0;
        double b = 8.0;
        x = (5 + (a++))/--b;
        System.out.println("2.4.  (5 + (a++))/b-- = " + x);
        //         2.5 (5 * 2 >> 2++) / --8 = 10>>2 / 7 = 2/7
        int c = 2;
        b = 8.0;
        x = (5 * 2 >> (c++)) / --b;
        System.out.println("2.5.  (5.0 * 2.0 >> (a++)) / --b = " + x);
        //         2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = (12 > 20 ? 68 : 11)/ --8 = 11/7
        c = 2;
        b = 8;
        x = (5 + 7 > 20 ? 68 : 22 * 2 >> (c++)) / --b;
        System.out.println("2.6.  (5 + 7 > 20 ? 68 : 22 * 2 >> (c++)) / --b = " + x);
        //         2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 =     44>>2/--8 = 11/7
        c = 2;
        int d = 8;
        boolean i;
        if ((5+7)>20) {
            i = 68 >= 68;
            System.out.println("2.7.  (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 = " + i);
        } else {
            x = 22 * 2 >> (c++);
        }
        System.out.println("2.7.  (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 = " + x/--d);
        //         2.8 6 - 2 > 3 && 12 * 12 <= 119  --> false
        i = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println("2.8.  6 - 2 > 3 && 12 * 12 <= 119  ----> " + i);
        //         2.9 true && false -->false
        i =  true && false;
        System.out.println("2.9.  true && false ----> " + i);




    }
}
