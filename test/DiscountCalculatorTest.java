import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    DiscountCalculator discountCalculator;



    @BeforeEach
    public void populate() {
        discountCalculator = new DiscountCalculator();
    }

    @Test
    public void HealthCheckTest() {

        //Given
        String expected = "OK !";

        //When
        String actual = discountCalculator.healthCheck();

        //Then
        assertEquals(expected, actual);
    }
}
