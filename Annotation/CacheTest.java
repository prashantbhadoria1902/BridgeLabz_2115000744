import java.lang.annotation.*;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveComputation {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Returning cached result for " + number);
            return cache.get(number);
        }
        int result = number * number;
        cache.put(number, result);
        System.out.println("Computed result for " + number);
        return result;
    }
}

class CacheTest {
    public static void main(String[] args) {
        ExpensiveComputation computation = new ExpensiveComputation();
        System.out.println(computation.computeSquare(5));
        System.out.println(computation.computeSquare(5));
    }
}
