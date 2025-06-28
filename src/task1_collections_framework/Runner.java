package task1_collections_framework;

import java.io.FileNotFoundException;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {
        Text text = new Text();
        String textByFile = text.readFile("src/task1_collections_framework/file/text.txt");
        System.out.println(textByFile);

        System.out.println("\nЧтение файла и вывод список слов: ");
        List<String> wordsByText = text.listWords(textByFile);
        System.out.println(wordsByText);

        System.out.println("\nСортировка слов игнорируя регистр: ");
        System.out.println("Sort ASC: " + text.sortWordAsc(wordsByText));
        System.out.println("Sort DESC: " + text.sortWordDesc(wordsByText));

        System.out.println("\nСписок уникальных слов: ");
        System.out.println(text.listUniqueWord(wordsByText));

        System.out.println("\nКол-во дубликатов\n[слово - кол-во в тексте(без учета регистра)]");
        System.out.println(text.infoDuplication(wordsByText));
    }
}