/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.app;

import com.qa.domain.Greeter;

import com.qa.interfaces.MessageFormatter;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GreetingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(Scanner myScanner  = new Scanner(System.in)){
            MessageFormatter formatter;
            System.out.println("Please enter a greeting.");
            String greeting  = myScanner.next();
            Greeter gt  = new Greeter(formatter);
            
            System.out.println("The greeting is :" + gt.greet(greeting));
        }
    }
    
}
