import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        String text = "Java is great and Java is powerful and Java is popular";

        text = text.toLowerCase();
        String[] words = text.split("\\s+");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zа-я0-9]", ""); // тыныс белгілерді жою
            if (word.isEmpty()) continue;

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Сөз саны: " + words.length);
        System.out.println("\nЖиілік:");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}