package LopTriangle;

public class Triangle extends Point{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid(){
        return dictance(a, b) + dictance(b, c) > dictance(a, c)
                && dictance(a, c) + dictance(b, c) > dictance(a, b)
                && dictance(a, b) + dictance(a, c) > dictance(b, c);
    }

    public String getPerimeter(){
        double res = dictance(a, b) + dictance(b, c) + dictance(c, a);
        return String.format ("%.3f",(double) Math.round(res*1000)/1000);
    }
}
