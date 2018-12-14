/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.MathApplication;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import org.junit.Test;
import static org.junit.Assert.*;
import interfaces.BasicCalculatorService;

/**
 *
 * @author Administrator
 */
public class MathApplicationTest {

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFibonacciAddition() {
        //Arrange
        BasicCalculatorService mockCalculatorService = createMock(BasicCalculatorService.class);
        
        expect(mockCalculatorService.fibonacciAdd(10, 20)).andReturn(30.0);//registers the mock
        
        replay(mockCalculatorService);// activates the mock
        
        MathApplication app = new MathApplication(mockCalculatorService);
        double expected = app.fibonacciAdd(10, 20);
        
        assertEquals(30.0, expected, 1e-4);
        verify(mockCalculatorService); //make sure that the methods were called on the mock

    }
    
        @Test
    public void testFibonacciSubtraction() {
        //Arrange
        BasicCalculatorService mockCalculatorService = createMock(BasicCalculatorService.class);
        
        expect(mockCalculatorService.fibonacciSubtract(10, 20)).andReturn(25.0);//registers the mock
        
        replay(mockCalculatorService);// activates the mock
        
        MathApplication app = new MathApplication(mockCalculatorService);
        double expected = app.fibonacciSubtract(10, 20);
        
        assertEquals(25.0, expected, 1e-4);
        verify(mockCalculatorService); //make sure that the methods were called on the mock
    }
}
