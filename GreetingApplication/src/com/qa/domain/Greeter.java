/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

import com.qa.interfaces.MessageFormatter;

/**
 *
 * @author Administrator
 */
public class Greeter {
private MessageFormatter formatter;
    public Greeter(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    public String greet(String message) {
        return formatter.transform(message);
    }
    
    public void send(String to, String message){
        formatter.sendEmail(to, message);
    }
}
