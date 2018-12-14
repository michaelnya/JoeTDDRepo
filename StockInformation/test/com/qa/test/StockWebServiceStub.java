/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.test;

import java.util.HashMap;
import java.util.Map;
import com.qa.interfaces.StockWebService;

/**
 *
 * @author Administrator
 */
public class StockWebServiceStub implements StockWebService {

    @Override
    public boolean authenticate(int name, String password) {
        return false;
    }

    private Map<String, String> getData() {

 
        Map<String, String> stockData = new HashMap<>();
        stockData.put("AMZN", "AMZN,Amazon Plc,1234,10000");
        stockData.put("EBAY", "?,?,?,?,?");
        stockData.put("IBM", "?,?,?,?,?");
        stockData.put("ESL", "?,?,?,?,?");
        return stockData;
    }

    @Override
    public String getStockInfo(String code) {
        return getData().get(code);
    }
}
