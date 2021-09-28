/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhaiBaoLopThiSinh;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hn281
 */
public class ThiSinh {
    private String name;
    private String birthday;
    private float point[] = new float[3];
    private float tb;

    public ThiSinh() {
    }

    public ThiSinh(String name, String birthday, float point[]) {
        this.name = name;
        this.birthday = birthday;
        for(int i = 0; i < 3; i++){
            this.point[i] = point[i];
        }
        this.tb = avg();
    }
    public float avg(){
        float sum = 0;
        for(int i = 0; i < 3; i++){
            sum += point[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        return name + " " + birthday + " " + String.format("%.1f", tb);
    }
    
    
}
