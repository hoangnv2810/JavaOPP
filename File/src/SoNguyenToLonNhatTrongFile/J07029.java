package SoNguyenToLonNhatTrongFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class J07029 {
    private static boolean prime[] = new boolean[1000001];
    private static void sieve(){
        for(int i = 0; i < 1000001; i++){
            prime[i] = true;
        }
        prime[0] = prime[1] = false;
        for(int i = 2; i*i < 1000001; i++){
            if(prime[i]){
                for(int j = i*i; j < 1000001; j += i){
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());
        sieve();
        for(Integer i:list){
            if(prime[i]){
                if (tm.containsKey(i)) {
                    tm.put(i, tm.get(i)+1);
                } else {
                    tm.put(i, 1);
                }
            }
        }
        int cnt = 0;
        for(Integer i:tm.keySet()){
            if(cnt < 10){
                System.out.println(i + " " + tm.get(i));
                cnt++;
            } else {
                break;
            }
        }

    }
}
