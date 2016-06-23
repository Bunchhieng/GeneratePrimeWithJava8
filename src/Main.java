import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        List<Integer> primes = Stream.iterate(1, e -> e + 1)
                .filter(Main::isPrime)
                .peek(System.out::println)
                .limit(10)
                .collect(toList());
    }

    private static boolean isPrime(int num) {
        return LongStream.rangeClosed(2, (long) (Math.sqrt(num)))
                .allMatch(n -> num % n != 0);
    }
}
