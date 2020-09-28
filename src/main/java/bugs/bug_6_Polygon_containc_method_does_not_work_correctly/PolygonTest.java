package main.java.bugs.bug_6_Polygon_containc_method_does_not_work_correctly;


import java.awt.*;

public class PolygonTest {
    public static void main(String[] args) {
        int[] xPoints = {-2, 2, -2, 2};
        int[] yPoints = {2, 2, -2, -2};

        Polygon polygon = new Polygon(xPoints, yPoints, xPoints.length);
        boolean checkPoint = polygon.contains(1, 1);
        System.out.println(checkPoint);//why false?) -> should be true))
        //The contains and intersects methods consider the interior of a Shape to be the area it encloses as if it were filled.
        // This means that these methods consider unclosed
        // shapes to be implicitly closed for the purpose of determining if a shape contains or intersects
        // a rectangle or if a shape contains a point.
        //Definition of insideness: A point is considered to lie inside a Shape if and only if:
        //It lies completely inside theShape boundary or

        //it lies exactly on the Shape boundary and the space immediately adjacent to the point in the increasing
        // X direction is entirely inside the boundary or

        //it lies exactly on a horizontal boundary segment and the space immediately adjacent to the point
        // in the increasing Y direction is inside the boundary.
        
        //next code result is true
        checkPoint = polygon.contains(-1, -1);
        System.out.println(checkPoint);
        checkPoint = polygon.contains(0, -1);
        System.out.println(checkPoint);
        checkPoint = polygon.contains(-1, 1);
        System.out.println(checkPoint);
        checkPoint = polygon.contains(0, 1);
        System.out.println(checkPoint);
        checkPoint = polygon.contains(-1, -2);
        System.out.println(checkPoint);
        checkPoint = polygon.contains(-2, -2);
        System.out.println(checkPoint);
        checkPoint = polygon.contains(0, -2);
        System.out.println(checkPoint);
        // I've wasted mb more then 4 hours to understand how it's work, but i couldn't one... So sad for me :(
    }
}
