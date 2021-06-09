package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MainApp {
    public static void main(String[] args) throws IOException {
        // wordsToSet();
        topWords(3);
    }

    public static void wordsToSet() throws IOException {
       // Path fileName = Path.of("src/home_work_7/WarAndPeace.txt");
        String allBookString = /*Files.readString(fileName);*/ "Эти слова я поместил  семь семь лет назад я я я";
        Set<String> wordsInSet = new HashSet<>();
        String[] allBookArray = allBookString.split(" ");

        Collections.addAll(wordsInSet, allBookArray);

        System.out.println(wordsInSet.size());
    }

    public static void topWords(int n) throws IOException {
        // Path fileName = Path.of("src/home_work_7/WarAndPeace.txt");
        String allBookString = /*Files.readString(fileName);*/ "Эти слова я поместил семь семь лет назад я я я";
        String[] allBookArray = allBookString.split(" ");

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

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(wordsInMap);

        System.out.println(treeMap.);
    }
}