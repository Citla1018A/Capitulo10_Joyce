/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10_Joyce;

/**
 *
 * @author Citlalli
 */
public class Car extends Vehicle {

    public Car(Integer ruedas, Integer millas) {
        super(ruedas, millas);
        super.setRuedas(4);
    }
}
