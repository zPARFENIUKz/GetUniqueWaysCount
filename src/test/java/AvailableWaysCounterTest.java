import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AvailableWaysCounterTest {

    @ParameterizedTest
    @ArgumentsSource(WayCountArgumentsProvider.class)
    void getCountOfAvailableWaysForRobot(final int x, final int y, final int expected) {
        assertEquals(expected, AvailableWaysCounter.getCountOfAvailableWaysForRobot(x, y));
    }

    private static class WayCountArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(1, 2, 3)
            );
        }
    }
}