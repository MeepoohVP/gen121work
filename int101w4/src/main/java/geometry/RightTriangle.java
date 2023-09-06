/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry;

/**
 * this class compute area and diagonal of right trangle
 * @author Student
 */
public class RightTriangle {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double computeArea(){
        return 0.5 * base * height;
    }
    public double computeDiagonal(){
        return Math.sqrt(base*base + height*height);
    }
    public double computePerimeter(){
        return base + height + computeDiagonal();
    }
    
}
