import org.testng.annotations.DataProvider;

public class DataProviderForCalculator {
    @DataProvider(name = "additionData")
    private Object[][] additionDataMethod(){
        return new Object[][]{
                {1,2,3},
                {2,3,5},
                {4,5,9}
        };
    }

    @DataProvider(name = "subtractionData")
    private Object[][] subtractionDataMethod(){
        return new Object[][]{
                {2,1,1},
                {3,2,1},
                {5,4,1}
        };
    }

    @DataProvider(name = "multiplicationData")
    private Object[][] multiplicationDataMethod(){
        return new Object[][]{
                {1,2,2},
                {2,3,6},
                {4,5,20}
        };
    }

    @DataProvider(name = "percentageData")
    private Object[][] percentageDataMethod(){
        return new Object[][]{
                {1,2,50},
                {2,8,25},
                {4,40,10}
        };
    }

    @DataProvider(name = "squareData")
    private Object[][] squareDataMethod(){
        return new Object[][]{
                {2,4},
                {5,25},
                {9,81}
        };
    }
}
