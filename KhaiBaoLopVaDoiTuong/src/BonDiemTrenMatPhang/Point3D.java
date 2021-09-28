package BonDiemTrenMatPhang;

public class Point3D {
    private int x;
    private int y;
    private int z;

    public Point3D(){
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ(){
        return z;
    }

    public static Point3D vector(Point3D p1, Point3D p2){
        Point3D vt = new Point3D();
        vt.x = p2.x-p1.x;
        vt.y = p2.y-p1.y;
        vt.z = p2.z-p1.z;
        return vt;
    }

    public static Point3D mulDirect(Point3D p1, Point3D p2){
        Point3D res= new Point3D();
        res.x = p2.z*p1.y - p2.y*p1.z;
        res.y = p2.x*p1.z - p2.z*p1.x;
        res.z = p2.y*p1.x - p2.x*p1.y;
        return res;
    }

    public static int mul(Point3D p1, Point3D p2){
        return p1.x*p2.x + p1.y*p2.y + p1.z*p2.z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Point3D a = vector(p1, p2);
        Point3D b = vector(p1, p3);
        Point3D c = vector(p1, p4);
        return mul(mulDirect(a,b), c) == 0;
    }
}
