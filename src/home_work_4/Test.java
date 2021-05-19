package home_work_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static String toWeek (int day) {
        String weekString = "21243162";
        String result = "";

        System.out.println(weekString);

        String pattern1 = "6$|4$";
//        String pattern2 = "1$";
//        String pattern3 = "234$";

        Pattern pat1 = Pattern.compile(pattern1);
        Matcher match1 = pat1.matcher(weekString);
//
//        Pattern pat2 = Pattern.compile(pattern2);
//        Matcher match2 = pat2.matcher(weekString);
//
//        Pattern pat3 = Pattern.compile(pattern3);
//        Matcher match3 = pat3.matcher(weekString);

        if (match1.find())
            result = weekString + " недель";
//        else if (match2.find())
//            result.concat(weekString + " неделя");
//        else if (match3.find())
//            result.join(" ", weekString).concat(" недели");


        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toWeek(225));
    }
}


