import java.util.*;

public class MaxValueKey {
    public static String getMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map<String, Integer> input = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println("Key with Highest Value: " + getMaxKey(input));
    }
}
