package DiemDanh2;
public class Student {
    private String id;
    private String name;
    private String className;
    private String s;

    public Student(String id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public Student(String id, String name, String className, String s) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.s = s;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getS() {
        return s;
    }

    public int rollCall(){
        int point = 10;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'v'){
                point -= 2;
            } else if(s.charAt(i) == 'm'){
                point -= 1;
            }
        }
        if(point < 0){
            return 0;
        }
        return point;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + rollCall() + ((rollCall() == 0) ? " KDDK": "");
    }
}
