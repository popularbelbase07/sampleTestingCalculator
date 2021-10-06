package BaseEx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void Test_AddMethod()
    {
        //create the object of the class
        //Act
        BasicCalculation BC = new BasicCalculation();
        //Arrange
        double result = BC.Add(10, 10);
        //Assert
        assertEquals(result,20);
    }
    @Test
    public void Test_SubMethod()
    {
        //create the object of the class
        //Act
        BasicCalculation BC = new BasicCalculation();
        //Arrange
        double result = BC.Sub(20, 10);
        //Assert
        assertEquals(result, 10);

    }
    @Test
    public void Test_DivMethod()
    {
        //create the object of the class
        //Act
        BasicCalculation BC = new BasicCalculation();
        //Arrange
        double result = BC.Division(20, 10);
        //Assert
        assertEquals(result, 2);

    }
    @Test
    public void Test_ProMethod()
    {
        //create the object of the class
        //Act
        BasicCalculation BC = new BasicCalculation();
        //Arrange
        double result = BC.Product(20, 10);
        //Assert
       assertEquals(result, 200);

    }

}