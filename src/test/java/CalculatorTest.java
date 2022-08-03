
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;
    @BeforeMethod
    private void setUp(){
        calculator = new Calculator();
    }

    @Test(groups = {"simpleCalculation"})
    private void testAdditionOfTwoNumbers(){
        //Arrange
        int firstNumber = 5;
        int secondNumber = 10;

        //Act
        int sum = calculator.add(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(sum, 15);
    }

    @Test(groups = {"simpleCalculation"})
    private void testSubtractionOfTwoNumbers(){
        //Arrange
        int firstNumber = 10;
        int secondNumber = 5;

        //Act
        int subtraction = calculator.subtract(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(subtraction, 5);
    }

    @Test(groups = {"simpleCalculation"})
    private void testMultiplicationOfTwoNumbers(){
        //Arrange
        int firstNumber = 5;
        int secondNumber = 10;

        //Act
        int multiplication = calculator.multiply(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(multiplication, 50);
    }

    @Test(groups = {"complexCalculation"})
    private void testPercentageOfTwoNumbers(){
        //Arrange
        int firstNumber = 5;
        int secondNumber = 10;

        //Act
        double percentage = calculator.percentage(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(percentage, 50.0);
    }

    @Test(groups = {"complexCalculation"})
    private void testSquareOfANumber(){
        //Arrange
        int number = 5;

        //Act
        int square = calculator.square(number);

        //Assert
        Assert.assertEquals(square, 25);
    }

    @AfterMethod
    private void tearDown(){
        System.out.println("Running after every test");
    }
}
