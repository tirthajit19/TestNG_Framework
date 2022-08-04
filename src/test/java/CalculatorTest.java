
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

    @Test(groups = {"simpleCalculation"}, dataProviderClass = DataProviderForCalculator.class, dataProvider = "additionData")
    private void testAdditionOfTwoNumbers(int firstNumber, int secondNumber, int result){
//        //Arrange
//        int firstNumber = 5;
//        int secondNumber = 10;

        //Act
        int sum = calculator.add(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(sum, result);
    }

    @Test(groups = {"simpleCalculation"}, dataProviderClass = DataProviderForCalculator.class, dataProvider = "subtractionData")
    private void testSubtractionOfTwoNumbers(int firstNumber, int secondNumber, int result){
//        //Arrange
//        int firstNumber = 10;
//        int secondNumber = 5;

        //Act
        int subtraction = calculator.subtract(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(subtraction, result);
    }

    @Test(groups = {"simpleCalculation"}, dataProviderClass = DataProviderForCalculator.class, dataProvider = "multiplicationData")
    private void testMultiplicationOfTwoNumbers(int firstNumber, int secondNumber, int result){
//        //Arrange
//        int firstNumber = 5;
//        int secondNumber = 10;

        //Act
        int multiplication = calculator.multiply(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(multiplication, result);
    }

    @Test(groups = {"complexCalculation"}, dataProviderClass = DataProviderForCalculator.class, dataProvider = "percentageData")
    private void testPercentageOfTwoNumbers(int firstNumber, int secondNumber, int result){
//        //Arrange
//        int firstNumber = 5;
//        int secondNumber = 10;

        //Act
        double percentage = calculator.percentage(firstNumber, secondNumber);

        //Assert
        Assert.assertEquals(percentage, result);
    }

    @Test(groups = {"complexCalculation"}, dataProviderClass = DataProviderForCalculator.class, dataProvider = "squareData")
    private void testSquareOfANumber(int number, int result){
//        //Arrange
//        int number = 5;

        //Act
        int square = calculator.square(number);

        //Assert
        Assert.assertEquals(square, result);
    }

    @AfterMethod
    private void tearDown(){
        System.out.println("Running after every test");
    }
}
