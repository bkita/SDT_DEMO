package streamDemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;


class NumberParserTest {

    @Test
    void shouldReturnValidList() {
        List<Integer> numbersToParse = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        assertThat(NumberParser.getEvenNumberGtnFour(numbersToParse)).containsExactly(6, 8);
    }
}