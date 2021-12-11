package LietKeTheoThuTuXuat;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>) in.readObject();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        for(String s:list){
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                lhs.add(st.nextToken().toLowerCase());
            }
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        while (sc.hasNext()){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            while (st.hasMoreTokens()){
                lhs2.add(st.nextToken().toLowerCase());
            }
        }
        for (String s:lhs2){
            if(lhs.contains(s)){
                System.out.println(s);
            }
        }
    }
}
