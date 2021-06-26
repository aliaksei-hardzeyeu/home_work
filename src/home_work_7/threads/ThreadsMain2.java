package home_work_7.threads;


import home_work_7.ISearchEngine;
import home_work_7.RegExSearch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ThreadsMain2 {
    private static String directoryFullPath;
    private static List<String> listOfBooks;
    private static String[] arrayOfBooks;

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println("Введите адрес папки");

        File directory = new File(bufferedReader.readLine());
        directoryFullPath = directory.getAbsoluteFile().toString();

        System.out.println("DIRECTORY: " + directoryFullPath);


        arrayOfBooks = directory.list();
        listOfBooks = new ArrayList<>();

        for (int i = 0; i < arrayOfBooks.length; i++) {
            listOfBooks.add(directoryFullPath + "\\" + arrayOfBooks[i]);
        }

        boolean anotherSearch;
        do {

            System.out.println("**********************************\n Введите слово для поиска");
            String searchedWord = bufferedReader.readLine();

            for (int i = 0; i < listOfBooks.size(); i++) {
                new Thread(task(i, searchedWord)).start();
            }

            System.out.println("Будем искать ещё слова? 1 - да, 2 - нет");
            String answer1 = bufferedReader.readLine();

            anotherSearch = answer1.equals("1");
        } while (anotherSearch);


    }

    private static Runnable task(int i, String searchedWord) throws IOException {
        Path chosenFile = Path.of(listOfBooks.get(i));

        String chosenBook = Files.readString(chosenFile);

        ISearchEngine searchEngine = new RegExSearch();
        long counter = searchEngine.search(chosenBook, searchedWord);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(directoryFullPath + "\\resultThreads.txt", true));
            writer.write("Книга: " + arrayOfBooks[i] + " >>> слово: " + searchedWord + " >>> встречается " + counter + " раз\n");
            writer.flush();

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом");
        }

        return null;
    }

}
