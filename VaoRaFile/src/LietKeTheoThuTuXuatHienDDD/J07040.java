package LietKeTheoThuTuXuatHienDDD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LinkedHashSet<String> tu1=new LinkedHashSet<>();
        LinkedHashSet<String> tu2=new LinkedHashSet<>();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> day1=(ArrayList<String>) ois.readObject();
        for (String s:day1){
            StringTokenizer st=new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String s1=st.nextToken();
                tu1.add(s1.toLowerCase());
            }
        }
        ois.close();
        Scanner sc=new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            StringTokenizer st=new StringTokenizer(sc.nextLine());
            while(st.hasMoreTokens()){
                String s1=st.nextToken();
                tu2.add(s1.toLowerCase());
            }
        }
        for (String i:tu2){
            if(tu1.contains(i)){
                System.out.println(i);
            }
        }
    }
}
