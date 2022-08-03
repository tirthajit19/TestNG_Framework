
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    private void testAdditionOfTwoNumbers(){
        //Arrange
        int firstNumber = 5;
        int secondNumber = 10;

        //Act
        Calculator calculator = new Calculator();
        int sum = calculator.add(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(sum, 15);
    }

    @Test
    private void testSubtractionOfTwoNumbers(){
        //Arrange
        int firstNumber = 10;
        int secondNumber = 5;

        //Act
        Calculator calculator = new Calculator();
        int subtraction = calculator.subtract(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(subtraction, 5);
    }

    @Test
    private void testMultiplicationOfTwoNumbers(){
        //Arrange
        int firstNumber = 5;
        int secondNumber = 10;

        //Act
        Calculator calculator = new Calculator();
        int multiplication = calculator.multiply(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(multiplication, 50);
    }

    @Test
    private void testPercentageOfTwoNumbers(){
        //Arrange
        int firstNumber = 5;
        int secondNumber = 10;

        //Act
        Calculator calculator = new Calculator();
        double percentage = calculator.percentage(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(percentage, 50.0);
    }

    @Test
    private void testSquareOfANumber(){
        //Arrange
        int number = 5;

        //Act
        Calculator calculator = new Calculator();
        int square = calculator.square(number);

        //Assert
        Assert.assertEquals(square, 25);
    }
}
