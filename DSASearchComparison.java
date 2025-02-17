import java.util.*;

public class DSASearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        Random random = new Random();
        
        for (int n : sizes) {
            int target = random.nextInt(n);
            
            int[] array = new int[n];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            
            for (int i = 0; i < n; i++) {
                int value = random.nextInt(n * 10);
                array[i] = value;
                hashSet.add(value);
                treeSet.add(value);
            }
            
            long start, end;
            
            start = System.nanoTime();
            for (int num : array) {
                if (num == target) break;
            }
            end = System.nanoTime();
            System.out.println("Array Search (N=" + n + "): " + (end - start) / 1e6 + " ms");
            
            start = System.nanoTime();
            hashSet.contains(target);
            end = System.nanoTime();
            System.out.println("HashSet Search (N=" + n + "): " + (end - start) / 1e6 + " ms");
            
            start = System.nanoTime();
            treeSet.contains(target);
            end = System.nanoTime();
            System.out.println("TreeSet Search (N=" + n + "): " + (end - start) / 1e6 + " ms");
        }
    }
}
