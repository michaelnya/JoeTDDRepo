/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.interfaces;

import com.acmefinancials.domain.Rate;
import java.util.Dictionary;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public interface ForexService {
    double getRateByCode(String code);//flawed speak to developers in next conference call
    Map<String,Rate> getRates(String code);
}
