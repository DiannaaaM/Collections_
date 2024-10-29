import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println();
        HashSet<Integer> uniqueWords = new HashSet<>(nums);

        System.out.println("Unique words:");
        for (int q : uniqueWords) {
            System.out.println(q);
        }
        System.out.println();
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word duplicates:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + (entry.getValue() - 1));
        }
    }
}
