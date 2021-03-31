package home_work_1;

public class Task4 {
    public static void main(String[] args) {
        if (sleepIn(true, false)) {
            System.out.println("You can sleep");
        } else System.out.println("Get up");
    }

    public static boolean sleepIn (boolean weekDay, boolean vacation) {

        if ((weekDay == true) && (vacation == false)) {
            return false;
        } else if ((weekDay == true) && (vacation == true)) {
            return true;
        } else return true;
    }
}
