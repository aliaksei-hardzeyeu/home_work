package home_work_7;

import java.util.Arrays;

import static home_work_7.MainApp.allBookString;

public class SearchEnginePunctuationNormalizer implements ISearchEngine{
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public static void main(String[] args) {

        ISearchEngine complicatedEngine = new SearchEnginePunctuationNormalizer( new EasySearch());
        System.out.println(complicatedEngine.search(allBookString, "это"));
    }


    @Override
    public long search(String text, String word) {
        String text2 = text.replaceAll("\\s*\\p{P}\\s*", " ");
        String text3 = text2.replaceAll("\\s+", " ");

        return this.searchEngine.search(text3, word);
    }
}
