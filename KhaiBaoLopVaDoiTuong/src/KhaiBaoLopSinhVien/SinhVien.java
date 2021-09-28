/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhaiBaoLopSinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hn281
 */
public class SinhVien {
    private String name;
    private String studentCode;
    private String className;
    private Date birthday;
    private float gpa;

    public SinhVien() {
        this.name = "";
        this.studentCode = "B20DCCN001";
        this.className = "";
        this.birthday = new Date();
        this.gpa = 0;
    }

    public SinhVien(String name, String className, String birthday, float gpa) throws ParseException {
        this.name = name;
        this.studentCode = "B20DCCN001";
        this.className = className;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.studentCode + " " + this.name + " " + this.className + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(birthday) + " "
                + String.format("%.2f", this.gpa);
    }



}
