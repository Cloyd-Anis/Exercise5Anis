package problem2shapes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aniscl_cis21035
 */
public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter(){
        return  2*(Math.PI * radius);
    }
    @Override
    public String toString(){
        return "A circle with radius ="+radius+" which is a subclass of "+super.toString();
    }
}
