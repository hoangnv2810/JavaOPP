package LopTriangle;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point a){
        this.x = a.x;
        this.y = a.y;
    }

    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextInt(), sc.nextInt());
    }

    public double dictance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x-b.x, 2) + Math.pow(a.y-b.y, 2));
    }
}
