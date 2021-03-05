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
public class Student extends Person {
    private String study;
    private Double average;

    public Student(String study, Double average, String fName, String lName, String sAdress, Integer zCode, Integer phone) {
        super(fName, lName, sAdress, zCode, phone);
        this.study = study;
        this.average = average;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Area de estudio"+this.study+", Promedio: "+this.average);
    }
}
