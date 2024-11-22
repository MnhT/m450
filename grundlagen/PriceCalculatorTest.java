public class PriceCalculatorTest {

    // Reference to the PriceCalculator class
    PriceCalculator calculator = new PriceCalculator();

    public boolean test_calculate_price() {
        double price;
        boolean test_ok = true;

        // Test 1: 3 extras, 10% discount
        price = calculator.calculatePrice(10000, 2000, 500, 3, 10);
        if (price != 11950) {
            System.out.println("Test 1 failed: Expected 11950, got " + price);
            test_ok = false;
        }

        // Test 2: 5 extras, 15% discount
        price = calculator.calculatePrice(10000, 2000, 500, 5, 15);
        if (price != 11925) {
            System.out.println("Test 2 failed: Expected 11925, got " + price);
            test_ok = false;
        }

        // Test 3: No extras, no discount
        price = calculator.calculatePrice(10000, 2000, 500, 0, 0);
        if (price != 12500) {
            System.out.println("Test 3 failed: Expected 12500, got " + price);
            test_ok = false;
        }

        return test_ok;
    }

    public static void main(String[] args) {
        PriceCalculatorTest test = new PriceCalculatorTest();
        if (test.test_calculate_price()) {
            System.out.println("All tests passed.");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
