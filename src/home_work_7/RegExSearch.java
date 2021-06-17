package home_work_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static home_work_7.MainApp.allBookString;

public class RegExSearch implements ISearchEngine{
    public static void main(String[] args) {
        RegExSearch r = new RegExSearch();
        System.out.println(r.search(allBookString, "больше"));
    }

    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        long count = 0;

        int index = 1;

        while (matcher.find(index-1)) {
            count++;
            index = matcher.end();
        }

        return count;
    }
}
