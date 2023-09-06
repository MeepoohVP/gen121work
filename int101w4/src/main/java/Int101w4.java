import myutil.Util;
import geometry.Circle;
import geometry.RightTriangle;
public final class Int101w4 {

    public static void main(String[] args) {
        double r = 8;
        System.out.println("Area = " + Util.computeAreaOfCircle(r));
        System.out.println("Perimeter = " + Util.computePerimeterOfCircle(r));
        // Util.computeAreaOfRightTriangle(base, height);
        // Utile.computePerimeterofRightTriangle(base, height);
//        System.out.println(Util.computeAreaOfRightTriangle(5, 12));
//        System.out.println(Util.computePerimeterOfRightTriangle(5, 12));

//        Circle c = new Circle();
//        c.setRadius(5);
//        Circle d = c;
//        System.out.println(d.computeCircleArea());

        RightTriangle t = new RightTriangle();
        t.setBase(5.0);
        t.setHeight(12.0);
        System.out.println("Area of right triangle: " + t.computeArea());
        System.out.println("Diagonal of right triangle: " + t.computeDiagonal());
        System.out.println("Perimeter of right triangle: " + t.computePerimeter());
    }
}
