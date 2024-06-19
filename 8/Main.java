/*
Тумутов Амгалан Б763-2
Вариант А
18. В тексте определить все согласные буквы, встречающиеся не более чем в двух словах.
*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "ВСЁ ЖИВОЕ БОИТСЯ МУЧЕНИЯ, ВСЁ ЖИВОЕ БОИТСЯ СМЕРТИ; ПОЙМИ САМОГО СЕБЯ ВО ВСЯКОМ ЖИВОМ СУЩЕСТВЕ, НЕ МУЧАЙ И НЕ УБИВАЙ, НЕ ПРИЧИНЯЙ СТРАДАНИЙ И СМЕРТИ.";
        Map<Character, Integer> consonantsCount = new HashMap<>();
        String consonants = "бвгджзйклмнпрстфхцчшщ";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = Character.toLowerCase(text.charAt(i));
            if (consonants.contains(String.valueOf(currentChar))) {
                consonantsCount.put(currentChar, consonantsCount.getOrDefault(currentChar, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : consonantsCount.entrySet()) {
            if (entry.getValue() <= 2) {
                System.out.println("Согласная буква \"" + entry.getKey() + "\" встречается не более чем в двух словах");
            }
        }
    }
}




