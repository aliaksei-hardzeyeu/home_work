package home_work_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        matcher.find();


        return 0;
    }
}
