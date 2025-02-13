import java.util.*;

class LongestConsecutiveSequence {
    static int findLongestSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        int longest = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int count = 1, curr = num;
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongestSequence(arr));
    }
}

