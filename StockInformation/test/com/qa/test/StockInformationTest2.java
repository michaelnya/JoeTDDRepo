/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.test;

import com.qa.domain.StockInformation;
import com.qa.interfaces.StockWebService;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class StockInformationTest2 {

    public StockInformationTest2() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testGetStockInformationWhenAuthenticated() {
        StockWebService mockService = createMock(StockWebServiceStub.class);
        String password = "!za8Abcd";
        int userId = 999;
        String symbol = "ACME";
        StockInformation si = new StockInformation(symbol, userId, password, mockService);

        expect(mockService.authenticate(userId, password)).andReturn(Boolean.TRUE);
        expect(mockService.getStockInfo(symbol)).andReturn("ACME,Acme Ltd,123,56,3564500");

        String actualSymbol = si.getSymbol();

        replay(mockService);
        assertEquals(symbol, actualSymbol);
        
        verify(mockService);
    }
}
