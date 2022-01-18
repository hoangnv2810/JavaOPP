package LoaiBoSoNguyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.next();
            try {
                int num = Integer.parseInt(s);
            } catch (Exception e){
                a.add(s);
            }
        }
        Collections.sort(a);
        for(String s: a){
            System.out.print(s + " ");
        }
    }
}
