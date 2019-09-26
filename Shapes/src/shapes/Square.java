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
public class Square extends Rectangle {
    public Square(){}
    public  Square(double side){
        super(side,side);
    }
    public Square(double side, String color,boolean filled){
      super(side,side,color,filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side ){
        setLength(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public double getArea(){
        return getLength() * getLength();
    }
    @Override
    public double getPerimeter(){
        return 4*getLength();
    }
    @Override
    public String toString(){
        return "A square with a side of "+getLength()+" which is a subclass of "+super.toString();
    }
    
}
