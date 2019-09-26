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
public abstract class  Shape {
    protected String color;
    protected boolean  filled;
    public Shape(){}
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString(){
       String temp;
        if(filled == true){
           temp = "A Shape with a color of"+color+" and filled";
        }else{
            temp = "A Shape with a color of"+color+" and not filled";
        }
        return temp; 
    }
}
