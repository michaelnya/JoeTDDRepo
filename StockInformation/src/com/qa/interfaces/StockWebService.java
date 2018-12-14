/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.interfaces;

/**
 *
 * @author Administrator
 */
public interface StockWebService {
    boolean authenticate(int userId, String password);
    String getStockInfo(String code);
}
