package task1_collections_framework.task2;

import java.util.HashMap;
import java.util.Map;

public class Transliterate {
    public static HashMap<String, String> TRANS_RUSS_ENG = new HashMap<>();

    static {
        TRANS_RUSS_ENG.put("А", "A");
        TRANS_RUSS_ENG.put("Б", "B");
        TRANS_RUSS_ENG.put("В", "V");
        TRANS_RUSS_ENG.put("Г", "G");
        TRANS_RUSS_ENG.put("Д", "D");
        TRANS_RUSS_ENG.put("Е", "E");
        TRANS_RUSS_ENG.put("Ё", "YO");
        TRANS_RUSS_ENG.put("Ж", "ZH");
        TRANS_RUSS_ENG.put("З", "Z");
        TRANS_RUSS_ENG.put("К", "K");
        TRANS_RUSS_ENG.put("Л", "L");
        TRANS_RUSS_ENG.put("М", "M");
        TRANS_RUSS_ENG.put("Н", "N");
        TRANS_RUSS_ENG.put("О", "O");
        TRANS_RUSS_ENG.put("П", "P");
        TRANS_RUSS_ENG.put("Р", "R");
        TRANS_RUSS_ENG.put("С", "S");
        TRANS_RUSS_ENG.put("Т", "T");
        TRANS_RUSS_ENG.put("У", "U");
        TRANS_RUSS_ENG.put("Ф", "F");
        TRANS_RUSS_ENG.put("Х", "H");
        TRANS_RUSS_ENG.put("Ц", "C");
        TRANS_RUSS_ENG.put("Ч", "CH");
        TRANS_RUSS_ENG.put("Ш", "SH");
        TRANS_RUSS_ENG.put("Щ", "SHCH");
        TRANS_RUSS_ENG.put("Ъ", "\"");
        TRANS_RUSS_ENG.put("И", "I");
        TRANS_RUSS_ENG.put("Ы", "Y");
        TRANS_RUSS_ENG.put("Ь", "'");
        TRANS_RUSS_ENG.put("Э", "E");
        TRANS_RUSS_ENG.put("Ю", "YU");
        TRANS_RUSS_ENG.put("Я", "YA");
    }

    public String transliterate(String text) {
        String[] symbols = text.toUpperCase().split("");
        StringBuilder transText = new StringBuilder();
        for (String symbol : symbols) {
            if (symbol.matches("[A-za-z]+") || symbol.matches("[\\s\\d,.:()!?]")) {
                transText.append(symbol);
            } else {
                for (Map.Entry<String, String> key : TRANS_RUSS_ENG.entrySet()) {
                    if (symbol.equalsIgnoreCase(key.getKey())) {
                        transText.append(key.getValue());
                    }

                }
            }
        }
        return String.valueOf(transText);
    }
}
