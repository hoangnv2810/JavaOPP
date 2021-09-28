package KhaiBaoLopHinhChuNhat;

import java.util.Locale;

public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = chuanHoa(color);
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public double findArea(){
        return height*width;
    }

    public double findPerimeter(){
        return (height+width)*2;
    }

    private String chuanHoa(String color) {
        String ans = color.substring(0, 1).toUpperCase() + color.substring(1, color.length()).toLowerCase();
        return ans;
    }
    @Override
    public String toString() {
        return (int)findPerimeter() + " " + (int)findArea() + " " + color;
    }
}
