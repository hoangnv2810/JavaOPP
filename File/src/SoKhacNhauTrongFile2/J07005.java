package SoKhacNhauTrongFile2;

import java.io.*;
import java.util.Set;
import java.util.TreeMap;

public class J07005 {
    public static void main(String[] args) throws IOException {
//        DataOutputStream out = new DataOutputStream(new FileOutputStream("Test.txt"));
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0){
//            int n = sc.nextInt();
//            out.writeInt(n);
//        }
//        out.close();

        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        while (in.available() > 0){
            int n = in.readInt();
            if(tm.containsKey(n)){
                tm.put(n, tm.get(n)+1);
            } else{
                tm.put(n, 1);
            }
        }
        for(Integer key : tm.keySet()){
            System.out.println(key + " " + tm.get(key));
        }
    }
}
