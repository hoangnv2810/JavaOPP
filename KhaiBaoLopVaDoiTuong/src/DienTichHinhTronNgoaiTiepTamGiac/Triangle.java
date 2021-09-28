package DienTichHinhTronNgoaiTiepTamGiac;

public class Triangle extends Point{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle(double x, double y, Point p1, Point p2, Point p3) {
        super(x, y);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    private boolean isTriangle(){
        return distance(p1, p2) + distance(p2, p3) > distance(p1, p3)
                && distance(p1, p3) + distance(p2, p3) > distance(p1, p2)
                && distance(p1, p3) + distance(p1, p2) > distance(p2, p3);
    }

    public double perimeter(){
        return distance(p1, p2) + distance(p2, p3) + distance(p1, p3);
    }

    public double area(){
        double a = distance(p1, p2);
        double b = distance(p2, p3);
        double c = distance(p3, p1);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double areaOfCircumcircle(){
        double a = distance(p1, p2);
        double b = distance(p2, p3);
        double c = distance(p3, p1);
        double R = (a*b*c)/(4*area());
        return Math.PI*Math.pow(R, 2);
    }

    @Override
    public String toString() {
        return isTriangle() ? String.format("%.3f", areaOfCircumcircle()):"INVALID";
    }
}
