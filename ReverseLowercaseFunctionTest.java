import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLowercaseFunctionTest {
    @Test
    void apply() {
        ConcatStringFunction function = new ReverseLowercaseFunction();
        String[] veggies = {"Cucumber", "asparAGUS"};
        assertEquals(function.apply(veggies), "asparaguscucumber");
    }
}
