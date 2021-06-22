package home_work_7;

import home_work_2.sorts.SortUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOMain {
    public static void main(String[] args) throws IOException {
        chooseBookSearchWrite();
    }

    public static void chooseBookSearchWrite() throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Введите адрес папки");

        File directory = new File(bufferedReader.readLine());

        System.out.println("DIRECTORY: " + directory.getAbsoluteFile());

        String[] listOfBooks = directory.list();

        for (String book : listOfBooks) {
            System.out.println(book);
        }

        boolean anotherBook = false;
        do  {

            System.out.println("**********************************\n Выберите книгу");
            Path chosenFile = Path.of(directory.getAbsolutePath() + bufferedReader.readLine());

            String chosenBook = Files.readString(chosenFile);

            boolean anotherSearch = false;
            do {

                System.out.println("**********************************\n Введите слово для поиска");
                String searchedWord = bufferedReader.readLine();

                ISearchEngine searchEngine = new RegExSearch();
                long counter = searchEngine.search(chosenBook, searchedWord);

                System.out.println(searchedWord + " " + counter);

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(directory.getAbsoluteFile() + "result.txt", true));
                    writer.write("Книга: " + chosenFile + " >>> слово: " + searchedWord + " >>> встречается " + counter + " раз\n");
                    writer.flush();

                } catch (IOException e) {
                    System.out.println("Ошибка при работе с файлом");
                }

                System.out.println("Будем искать ещё слова в этой книге? 1 - да, 2 - нет");
                String answer1 = bufferedReader.readLine();

                if (answer1.equals("1")) {
                    anotherSearch = true;
                } else if (answer1.equals("2")) {
                    System.out.println("Для выбора другой книги введите 1. Для выхода нажмите 2.");
                    String answer2 = bufferedReader.readLine();

                    if (answer2.equals("1")) {
                        anotherBook = true;
                    } else {
                        return;
                    }
                }

            } while (anotherSearch);

        } while (anotherBook);
    }
}