package LopPolygon;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long tichCheo(Point p1){
        return x*p1.y - p1.x*y;
    }
}
