import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class DateNextDateOkTest {

    // Variables
    private int yearOrigin;
    private int monthOrigin;
    private int dayOrigin;
    private int yearNext;
    private int monthNext;
    private int dayNext;

    // Setter
    public DateNextDateOkTest(int yearO, int monthO, int daysO, int yearN, int monthN, int dayN) {
        this.yearOrigin = yearO;
        this.monthOrigin = monthO;
        this.dayOrigin = daysO;
        this.yearNext = yearN;
        this.monthNext = monthN;
        this.dayNext = dayN;
    }

    // Method to provide test data
    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1700, 06, 20, 1700, 06, 21),
                Arguments.of(2005, 4, 15, 2005, 4, 16),
                Arguments.of(1901, 7, 20, 1901, 7, 21),
                Arguments.of(3456, 3, 27, 3456, 3, 28),
                Arguments.of(1500, 2, 17, 1500, 2, 18),
                Arguments.of(1700, 6, 29, 1700, 6, 30),
                Arguments.of(1800, 11, 29, 1800, 11, 30),
                Arguments.of(3453, 1, 29, 3453, 1, 30),
                Arguments.of(444, 2, 29, 444, 3, 1),
                Arguments.of(2005, 4, 30, 2005, 5, 1),
                Arguments.of(3453, 1, 30, 3453, 1, 31),
                Arguments.of(3456, 3, 30, 3456, 3, 31),
                Arguments.of(1901, 7, 31, 1901, 8, 1),
                Arguments.of(3453, 1, 31, 3453, 2, 1),
                Arguments.of(3456, 12, 31, 3457, 1, 1));
    }

    // Test method using parameterized test
    @ParameterizedTest
    @MethodSource("data")
    public void NextDateOkTest(int yearOrigin, int monthOrigin, int dayOrigin,
            int yearNext, int monthNext,
            int dayNext) {
        Date date = new Date(yearOrigin, monthOrigin, dayOrigin);
        Date newDate = date.nextDate();
        Assertions.assertEquals(yearNext, newDate.getYear());
        Assertions.assertEquals(monthNext, newDate.getMonth());
        Assertions.assertEquals(dayNext, newDate.getDay());
    }
}