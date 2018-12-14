/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.test;

import com.qa.interfaces.BasicCalculatorService;
import com.qa.domain.MathApplication;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class MathApplicationTest {

    public MathApplicationTest() {
    }

    @Test
    public void testFibonacciAddition() {
        //Arrange
        BasicCalculatorService basicCalculatorService = new BasicCalculatorStub();
        MathApplication app = new MathApplication(basicCalculatorService);
        double expectedResult = 9999;

        //Act
        double actualResult = app.fibonacciAdd(10d, 20d);

        //Assert 
        assertEquals(expectedResult, actualResult, 1e-2);
    }

    @Test
    public void testFibonacciSubtraction() {
        //Arrange
        BasicCalculatorService basicCalculatorService = new BasicCalculatorStub();
        MathApplication app = new MathApplication(basicCalculatorService);
        double expectedResult = -999;

        //Act
        double actualResult = app.fibonacciSubtract(10d, 20d);

        //Assert 
        assertEquals(expectedResult, actualResult, 1e-2);
    }
}
