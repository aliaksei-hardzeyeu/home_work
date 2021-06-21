package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {


    public static Path fileName = Path.of("WarAndPeace.txt");
    public static String allBookString;

    static {
        try {
            allBookString = Files.readString(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        topWords(10);
        wordsToSet();

        ISearchEngine searchEngine = new SearchEngineCaseInsensitive(new RegExSearch());
        System.out.println("\"война\" встречается " + searchEngine.search(allBookString, "война") + " раз");
        System.out.println("\"и\" встречается " + searchEngine.search(allBookString, "и") + " раз");
        System.out.println("\"мир\" встречается " + searchEngine.search(allBookString, "мир") + " раз");

    }

    /**
     * Помещает отдельные слова в HashSet, в конце выводит количество слов.
     *
     * @throws IOException
     */
    public static void wordsToSet() throws IOException {
        String allBookString = Files.readString(fileName);
        List<String> wordsInArrayList = wordsToArrayList(allBookString);

        Set<String> wordsInSet = new HashSet<>();
        wordsInSet.addAll(wordsInArrayList);

        System.out.println(wordsInSet.size());
    }

    /**
     * Ищет отдельные слова в тексте и помещает их в ArrayList
     *
     * @param text заданный текст
     * @return ArrayList с отдельными словами из текста
     */
    public static ArrayList<String> wordsToArrayList(String text) {
        String pat = "\\b[а-яА-Я\\w]+(\\-[а-яА-Я\\w]+)?";
        Pattern pattern = Pattern.compile(pat);
        Matcher match1 = pattern.matcher(text);

        ArrayList<String> arrList = new ArrayList<>();

        while (match1.find()) {
            arrList.add(match1.group());
        }

        return arrList;
    }

    /**
     * Метод ищет самые используемые слова в тексте, помещает их в ArrayList в порядке убывания количества использований.
     * Потом выводит n самых используемых слов, начиная с первой позиции ArrayList.
     *
     * @param n количество слов, которое следует вывести
     * @throws IOException
     */
    public static void topWords(int n) throws IOException {
        String allBookString = Files.readString(fileName);
        List<String> wordsInArrayList = wordsToArrayList(allBookString);


        HashMap<String, Integer> wordsInMap = new HashMap<>();

        for (String word : wordsInArrayList) {
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