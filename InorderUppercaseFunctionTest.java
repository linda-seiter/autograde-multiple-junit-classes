import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InorderUppercaseFunctionTest {
    @Test
    void apply() {
        ConcatStringFunction function = new InorderUppercaseFunction();
        String[] veggies = {"Cucumber", "asparAGUS"};
        assertEquals(function.apply(veggies), "CUCUMBERASPARAGUS");
    }

}
