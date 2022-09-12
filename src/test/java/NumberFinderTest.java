import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFinderTest {
    @ParameterizedTest(name = "{0} _ {1}")
    @MethodSource("generateData")
    void testfindNumber(String input, List<String> output){
        NumberFinder numberFinder = new NumberFinderImpl();
        assertEquals(output, numberFinder.findNumber(input));
    }
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("abc 12", List.of()),
                Arguments.of("cdefg 345 12bb23", List.of("345")),
                Arguments.of("cdefg 345 12bbb33 678tt", Arrays.asList("345", "678"))
        );
    }
}
