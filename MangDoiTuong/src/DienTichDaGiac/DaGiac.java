package DienTichDaGiac;

public class DaGiac {
    private Point[] p;

    public DaGiac(Point[] p) {
        this.p = p;
    }

    public String getArea(){
        double sum = 0;
        for(int i = 0; i < p.length-1; i++){
            sum += p[i].tichCheo(p[i+1]);
        }
        sum += p[p.length-1].tichCheo(p[0]);
        return String.format("%.3f", sum/2);
    }
}
