package home_work_7;

import static home_work_7.MainApp.allBookString;

public class SearchEngineCaseInsensitive implements ISearchEngine{
    private ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public static void main(String[] args) {
        ISearchEngine complicatedEngine = new SearchEngineCaseInsensitive(new EasySearch());
        System.out.println(complicatedEngine.search(allBookString, "обнИмАть"));
    }


    @Override
    public long search(String text, String word) {
        String text2 = text.toLowerCase();
        String word2 = word.toLowerCase();
        return this.searchEngine.search(text2, word2);
    }
}
