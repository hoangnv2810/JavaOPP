package DienTichDaGiac;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long tichCheo(Point p){
        return x*p.y - p.x*y;
    }
}
