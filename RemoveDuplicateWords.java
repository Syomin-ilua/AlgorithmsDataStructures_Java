// Введена строка из повторяющихся слов. Требуется удалить все слова оставив только 1 в строке: abc abc ab abc ab acs acs → abc ab acs

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String str = "abc abc ab abc ab acs acs";

        String[] words = str.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        String result = String.join(" ", uniqueWords);
        System.out.println(result);
    }
}
