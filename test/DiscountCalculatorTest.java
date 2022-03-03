import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        String expected = "Checked!";

        //When
        String actual = discountCalculator.healthCheck();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGiveDiscountIfValueIsLessThan500Dollars(){
        //Given
        double price = 400.00;
        double priceWithDiscount = 380.00;

        //When
        double actual = discountCalculator.calculateDiscount(price);

        //Then
        assertEquals(priceWithDiscount, actual);
    }

    @Test
    public void shouldApply10PercentDiscountIfTheValueIsBetween500and1000Dollars(){
        double value = 500;
        double valueWithDiscount = 450;

        double actual = discountCalculator.calculateDiscount(500);

        assertEquals(valueWithDiscount, actual);
    }

    @Test
    public void shouldApply20PercentDiscountIfTheValueIsGreaterThanOrEqualTo1000Dollars(){

        double value = 1000;
        double valueWithDiscount = 800;

        double actual = discountCalculator.calculateDiscount(value);

        assertEquals(valueWithDiscount, actual);
    }


}
