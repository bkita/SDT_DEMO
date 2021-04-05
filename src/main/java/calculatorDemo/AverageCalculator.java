package calculatorDemo;

import java.util.List;

public class AverageCalculator {

    public static double calculateAverage(List<Double> numbers) {
        double average = 0;

        for (Double number : numbers) {
            average += number;
        }
        return average;
    }
}
