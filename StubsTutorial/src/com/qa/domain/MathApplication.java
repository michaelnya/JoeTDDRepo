/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

import com.qa.interfaces.BasicCalculatorService;

/**
 *
 * @author Administrator
 */
public class MathApplication {

    private BasicCalculatorService basicCalculatorService;

    public MathApplication(BasicCalculatorService basicCalculatorService) {
        this.basicCalculatorService = basicCalculatorService;
    }

    public double fibonacciAdd(double x, double y) {
        return basicCalculatorService.fibonacciAdd(x, y);//this uses service to get a result
    }

    public double fibonacciSubtract(double x, double y) {
        return basicCalculatorService.fibonacciSubtract(x, y);//this uses service to get a result
    }
}
