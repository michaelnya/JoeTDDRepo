/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.qa.domain.Greeter;
import com.qa.interfaces.MessageFormatter;
import org.easymock.EasyMock;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Administrator
 */
public class GreeterTest {
    private MessageFormatter mockFormatter;
    private Greeter greeter;
    
    public GreeterTest() {
    }
    
    @Before
    public void initialise(){
        mockFormatter  = createMock(MessageFormatter.class);
        greeter  = new Greeter(mockFormatter);
    }
    
    @Test
    public void testTransform(){
        //Arrange
        String outputMsg  = "HeLlO";
        String inputMsg  = "Hello";
        //register expectations on the mock
        expect(mockFormatter.transform(inputMsg)).andReturn(outputMsg);  
        //activate the mock
        replay(mockFormatter);
        
        //Act
        String actualMessage  =  greeter.greet(inputMsg);
        //Check that it returned the expected value
        assertTrue(actualMessage.equals(outputMsg));
        
        verify(mockFormatter);
    }
    
    @Test
    public void testSendEmail(){
        mockFormatter.sendEmail("testtest.com", "This is a message");
        expectLastCall();
        replay(mockFormatter);
        verify(mockFormatter);
    }
}
