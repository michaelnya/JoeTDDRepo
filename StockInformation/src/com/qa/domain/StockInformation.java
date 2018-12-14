/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

import com.qa.interfaces.StockWebService;

/**
 *
 * @author Administrator
 */
public class StockInformation {
    private String symbol;
    private final int userId;
    private final String password;
    private final StockWebService service;

    public StockInformation(String symbol, int userId, String password, StockWebService service) {
        setSymbol(symbol);
        this.userId = userId;
        this.password = password;
        
        
        this.service = service;
    }

    public String getSymbol() {
        return symbol;
    }

    private void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
