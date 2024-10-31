/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import bri.ICalculator;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rafael
 */
@Named(value = "jsfCalculator")
@RequestScoped
public class jsfCalculator {

    @EJB
    private ICalculator ebjCalculator;
    
    public jsfCalculator() {
    }
    
    public void sum() {
        result = ebjCalculator.sum(valueA, valueB);
    }
    
    @Getter @Setter
    private int valueA;
    
    @Getter @Setter
    private int valueB;
    
    @Getter @Setter
    private int result;
    
    
}
