/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bri;

import javax.ejb.Remote;

/**
 *
 * @author rafael de luca
 */
@Remote
public interface ICalculator {
    public int sum(int a, int b);
}
