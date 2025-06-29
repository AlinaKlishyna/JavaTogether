package task1_collections_framework.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Text {

    /**
     * .hashNextLine() - проверяет на наличие следующей строки
     * .nextLine() - считывает строку ДО ENTER и возвращает её
     */
    public String readFile(String pathToFile) throws FileNotFoundException {
        FileReader fileReader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(fileReader);

        String text = "";
        while (scanner.hasNextLine()) {
            text += scanner.nextLine();
        }
        return text;
    }

    // regex-выражение в котором:
    // [...] - шаблон набора поиска
    // ^ - все, кроме..
    // A-z - плохая идея, потому что берется не только буквы lower/upper case, но еще и символы _\^'
    // поэтому лучше использовать по отдельности A-Za-z
    // + - это "1+ таких символов подряд"
    public List<String> listWords(String text) {
        return List.of(text.split("[^A-Za-z]+"));
    }

    public List<String> sortWordAsc(List<String> words) {
        return words.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
    }

    public List<String> sortWordDesc(List<String> words) {
        return sortWordAsc(words).reversed();
    }

    public List<String> listUniqueWord(List<String> words) {
        return sortWordAsc(words).stream().distinct().toList();
    }

    public String infoDuplication(List<String> words) {
        List<String> sortWords = sortWordAsc(words);
        String info = "";
        int count = 0;
        for (int i = 0; i < sortWords.size(); i++) {
            String equal = "";
            for (int j = i + 1; j < sortWords.size() - 1; j++) {
                if (sortWords.get(i).equalsIgnoreCase(sortWords.get(j))) {
                    count++;
                } else {
                    equal = sortWords.get(i) + " - " + (count + 1) + "\n";
                    break;
                }
            }
            info += equal;
            i = i + count;
            count = 0;
        }
        return info;
    }
}