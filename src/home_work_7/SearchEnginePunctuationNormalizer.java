package home_work_7;

import java.util.Arrays;

import static home_work_7.MainApp.allBookString;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public String replacePunctuation(String text) {
        String text2 = text.replaceAll("\\s*\\p{P}\\s*", " ");
        String text3 = text2.replaceAll("\\s+", " ");

        return text3;
    }

    @Override
    public long search(String text, String word) {

        return this.searchEngine.search(replacePunctuation(text), word);
    }
}
