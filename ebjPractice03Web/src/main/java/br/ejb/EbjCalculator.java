/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author rafael de luca
 */
@Stateless
public class EbjCalculator implements bri.ICalculator {

    @Override
    public int sum(int a , int b) {
        return a + b;
    }
   
}
