import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class DateNextDateExceptionTest {

    // Test method using parameterized test
    @ParameterizedTest
    @MethodSource("dateValues")
    public void NextDateExceptionTest(int year, int month, int day) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Date(year,
                month, day));
    }

    // Method to provide test data
    public static Stream<Arguments> dateValues() {
        return Stream.of(
                Arguments.of(4356, 13, 4),
                Arguments.of(400, 1, 32),
                Arguments.of(-1, 11, 30),
                Arguments.of(1, -11, 3),
                Arguments.of(1000, 4, -3));
    }
}
