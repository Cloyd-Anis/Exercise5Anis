/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem2shapes;

/**
 *
 * @author aniscl_cis21035
 */
public class Problem2Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangle rec = new Rectangle(13,12," red",true);
        System.out.println(rec);
        System.out.printf("Perimeter:%.2f \nArea: %.2f \n",rec.getPerimeter(),rec.getArea());
        
        
        Circle c = new Circle(12," blue",true);
        System.out.println(c);
        System.out.printf("Perimeter:%.2f \nArea: %.2f \n",c.getPerimeter(),c.getArea());
        
        Square s = new Square(10," yellow",true);
        System.out.println(s);
        System.out.printf("Perimeter:%.2f \nArea: %.2f \n",s.getPerimeter(),s.getArea());
        Shape shape = new Rectangle(10,12," black",true);
        System.out.println(shape);
    }
    
}
