
package geometry;

public class Circle {
    private double radius; //information hiding, encapsulation
// base, height, RightTriangle
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter(){
        return radius*2;
    }
    public void setDiameter(double diameter){
        this.radius = diameter / 2.0;
    }
    public double computeCircleArea(){
        return Math.PI * radius * radius;
    }
    public double computeCirclePerimeter(){
        return 2 * Math.PI * radius;
    }
    
    
}
