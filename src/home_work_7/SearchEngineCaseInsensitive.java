package home_work_7;

import static home_work_7.MainApp.allBookString;

public class SearchEngineCaseInsensitive implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод приводит все буквы текста к нижнему регистру
     *
     * @param text заданный текст
     * @return текст в нижнем регистре
     */

    public String textToLowerCase(String text) {

        return text.toLowerCase();
    }

    /**
     * Метод приводит все буквы текста к нижнему регистру
     *
     * @param word заданный текст
     * @return текст в нижнем регистре
     */

    public String wordToLowerCase(String word) {

        return word.toLowerCase();
    }


    @Override
    public long search(String text, String word) {

        if (this.searchEngine instanceof RegExSearch) {
            return this.searchEngine.search(text, word);
        } else {
            return this.searchEngine.search(textToLowerCase(text), wordToLowerCase(word));
        }
    }
}
