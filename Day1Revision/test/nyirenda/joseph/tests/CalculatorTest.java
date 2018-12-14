/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyirenda.joseph.tests;

import nyirenda.joseph.domain.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Administrator
 */
public class CalculatorTest {

    @Test
    @Ignore
    public void testAdd() {
        //Arrange 
        double expected = 23;
        //Act
        double actual = Calculator.add(12d, 11d);
        //Assert
        assertEquals(expected, actual, 1e-2);
    }

    @Test
    @Ignore
    public void testMultiply() {
        //Arrange 
        double expected = 23;
        //Act
        double actual = Calculator.multiply(12d, 11d);

        //Assert
        assertEquals(expected, actual, 1e-2);
    }

    @Test
    @Ignore
    public void testSubtract() {
        //Arrange 
        double expected = 1;
        //Act
        double actual = Calculator.subtract(12d, 11d);

        //Assert
        assertEquals(expected, actual, 1e-2);
    }

    @Test
    @Ignore
    public void testDivide() {
        //Arrange 
        double expected = 23;
        //Act
        double actual = Calculator.divide(12d, 11d);

        //Assert
        assertEquals(expected, actual, 1e-2);
    }

    @Test
    public void testAddWithArrayOfStrings() {
        //Arrange
        String expectedResult = "OneTwoThree";
        String[] words = {"one", "two", "three"};
        //Act
        String actualResult = Calculator.add(words);
        //Assert
        assertTrue(expectedResult.equalsIgnoreCase(actualResult));
    }

    @Test
    public void testAddIntArray() {
        //Arrange
        double[] myList = {2, 5, 6, 32, 4};
        double expected = 49;
        //Act 

        double actual = Calculator.add(myList);
        //Assert
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArrayAverage() {
        //Arrange
        double[] myList = {2, 5, 6, 32, 4};
        double expected = 9.8;
        //Act 

        double actual = Calculator.average(myList);
        //Assert
        assertEquals(expected, actual, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayAverageWithEmptyArray() {
        //Arrange
        double[] myList = {};
        //Act 
        Calculator.average(myList);
    }
}
