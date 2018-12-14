/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyirenda.joseph.app;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import nyirenda.joseph.domain.Calculator;

/**
 *
 * @author Administrator
 */
public class Day1Revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an application that lets a user choose from a anumber of operations to perform
        // 1 - Addition, 2-Subtraction, 
        //When  a user selects an operation, invoke the relevant method and display the result
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Please enter the first number");
            double a = input.nextDouble();

            System.out.println("Please enter the second number");
            double b = input.nextDouble();
            
            System.out.println("Result : " );
        }
    }
}
