import calculatorDemo.AverageCalculator;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class AverageCalculatorTest {

    @Test
    void shouldCalculateCorrectAverage() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        assertThat(AverageCalculator.calculateAverage(numbers)).isEqualTo(2);
    }

}