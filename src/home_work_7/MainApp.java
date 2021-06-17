package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MainApp {

    public static Path fileName = Path.of("WarAndPeace.txt");
    public static String allBookString = null;

    static {
        try {
            allBookString = Files.readString(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        //wordsToSet();
        //topWords(2);
//        ISearchEngine complicatedEngine = new SearchEnginePunctuationNormalizer(new EasySearch());
//        System.out.println(complicatedEngine.search(allBookString, "это"));

        ISearchEngine complicatedEngine = new SearchEngineCaseInsensitive(new SearchEnginePunctuationNormalizer(new EasySearch()));
        System.out.println("Война - " + complicatedEngine.search(allBookString, "Война"));
        System.out.println("И - " + complicatedEngine.search(allBookString, "и"));
        System.out.println("Мир -" + complicatedEngine.search(allBookString, "мир"));

    }

    public static void wordsToSet() throws IOException {
        String allBookString = Files.readString(fileName);// "Эти-слова ? , я: поместил  семь. семь лет назад я я я и";
        String[] allBookArray = allBookString.split("[\\s\\xA0\\--]+");

        Set<String> wordsInSet = new HashSet<>();
        Collections.addAll(wordsInSet, allBookArray);

        System.out.println(wordsInSet.size());
    }

    public static void topWords(int n) throws IOException {
        String allBookString = Files.readString(fileName); //"как дела!.Что делаешь?";
        String[] allBookArray = allBookString.split("\\s*(\\s|,|!|\\.)\\s*");

        HashMap<String, Integer> wordsInMap = new HashMap<>();

        for (String word : allBookArray) {
            if (!wordsInMap.containsKey(word)) {
                wordsInMap.put(word, 1);
            } else {
                int repeatNumber = wordsInMap.get(word);
                repeatNumber++;
                wordsInMap.put(word, repeatNumber);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsInMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println("На " + (i + 1) + " месте по количеству употреблений слово " + list.get(i));
        }

    }
}