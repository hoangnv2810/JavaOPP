package SoNguyenToTrongFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class J4 {
    private static boolean prime[] = new boolean[10001];
    private static void sieve(){
        for(int i = 0; i < 10001; i++){
            prime[i] = true;
        }
        prime[0] = prime[1] = false;
        for(int i = 2; i*i < 10001; i++){
            if(prime[i]){
                for(int j = i*i; j < 10001; j += i){
                    prime[j] = false;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        sieve();
        for(Integer i: list){
            if(prime[i]){
                if(tm.containsKey(i)){
                    tm.put(i, tm.get(i)+1);
                } else {
                    tm.put(i, 1);
                }
            }
        }

        Set<Integer> set = tm.keySet();
        for(Integer key: set){
            System.out.println(key + " " + tm.get(key));
        }
        in.close();
    }
}
