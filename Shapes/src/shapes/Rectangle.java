package shapes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aniscl_cis21035
 */
public class Rectangle extends Shape {
    private double length = 1.0;
    private double width = 1.0;
    
    public Rectangle(){}
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, String color, boolean filled){
        this.length = length;
        this.width = width;
        setColor(color);
        setFilled(filled);
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getArea(){
        return  length * width;
    }
    public double getPerimeter(){
        return  (2*(length + width));
    }
    @Override
    public String toString(){
        return "A Rectangle with width="+width+" and length="+length+",which is a subclass of "+super.toString();
    }
}
