/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myutil;

/**
 * This class is a utility class of computing circle
 * @author Student
 */
public class Util {
    public static double computeAreaOfCircle(double radius){
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
    public static double computePerimeterOfCircle(double radius){
        return 2 * Math.PI * radius;
    }
    
    public static double computeAreaOfRightTriangle(double base, double height){
        return 0.5 * base * height;
        //this medthod is compute area of right triangle
        
    }
    public static double computePerimeterOfRightTriangle(double base, double height){
        return base + height + Math.sqrt(base*base + height*height);
        //this medthod is compute perimeter of right triangle
    }
}
