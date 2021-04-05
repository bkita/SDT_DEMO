package streamDemo;

import java.util.List;
import java.util.stream.Collectors;

public class NumberParser {

    public static List<Integer> getEvenNumberGtnFour(List<Integer> number) {
        return number.stream()
                .filter(n -> n % 2 == 0 && n > 3)
                .filter(n -> n > 4)
                .distinct()
                .collect(Collectors.toList());
    }
}
