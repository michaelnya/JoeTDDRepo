/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.test;

import com.qa.interfaces.BasicCalculatorService;



/**
 *
 * @author Administrator
 */
public class BasicCalculatorStub implements BasicCalculatorService {

    public BasicCalculatorStub() {
    }

    @Override
    public double fibonacciAdd(double x, double y) {
        return 9999;
    }

    @Override
    public double fibonacciSubtract(double x, double y) {
        return -999;
    }
}
