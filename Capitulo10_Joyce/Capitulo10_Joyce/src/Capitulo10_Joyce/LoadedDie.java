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
public class LoadedDie {
    protected Integer number;
    public LoadedDie(){
        this.number=(int)(Math.random()*6)+2;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
