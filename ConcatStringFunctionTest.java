import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatStringFunctionTest {
    @Test
    void annotation() throws NoSuchMethodException {
        assertTrue(ConcatStringFunction.class.isAnnotationPresent(FunctionalInterface.class));
    }
}
