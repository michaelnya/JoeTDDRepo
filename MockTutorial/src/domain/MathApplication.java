/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import interfaces.BasicCalculatorService;

/**
 *
 * @author Administrator
 */
public class MathApplication {
    private final BasicCalculatorService basicCalculatorService;
    public MathApplication(BasicCalculatorService calculatorService){
        this.basicCalculatorService = calculatorService;
    }

    public double fibonacciAdd(double x, double y) {        
        return basicCalculatorService.fibonacciAdd(x, y);
    }

    public double fibonacciSubtract(double x, double y) {
       return basicCalculatorService.fibonacciSubtract(x, y);
    }        
}
