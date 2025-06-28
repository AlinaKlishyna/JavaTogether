package task1_collections_framework;

import java.io.FileNotFoundException;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {
        Text text = new Text();
        String textByFile = text.readFile("src/task1_collections_framework/file/text.txt");
        System.out.println(textByFile);

        List<String> wordsByText = text.listWords(textByFile);
        System.out.println(wordsByText);
        System.out.println(text.sortWordAsc(wordsByText));
    }
}