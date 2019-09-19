/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author aniscl_cis21035
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4,5);
        System.out.println(rec);
        System.out.printf("Perimeter:%.2f \nArea: %.2f \n",rec.getPerimeter(),rec.getArea());
        Circle circ = new Circle(50.00);
        System.out.println(circ);
        System.out.printf("Area of Circle:%.2f \nCircumference of Circle: %.2f ",circ.getArea(),circ.getCircumference());
        
       
    }
    
}
