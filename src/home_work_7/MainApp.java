package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//        ISearchEngine complicatedEngine = new SearchEngineCaseInsensitive(new SearchEnginePunctuationNormalizer(new EasySearch()));
//        System.out.println("Война - " + complicatedEngine.search(allBookString, "Война"));
//        System.out.println("И - " + complicatedEngine.search(allBookString, "и"));
//        System.out.println("Мир -" + complicatedEngine.search(allBookString, "мир"));

//        wordsToSet();

        topWords(5);
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
    public static ArrayList<String> wordsToArrayList (String text) {
        String pat = "\\b[а-яА-Я\\w]+(\\-[а-яА-Я\\w]+)?";
        Pattern pattern = Pattern.compile(pat);
        Matcher match1 = pattern.matcher(text);

        ArrayList<String> arrList = new ArrayList<>();

        while (match1.find()) {
            arrList.add(match1.group());
        }

        return arrList;
    }
    public static void topWords(int n) throws IOException {
        String allBookString = Files.readString(fileName); //"как дела!.Что делаешь?";
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