package CapSoNguyenTrongFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J1 {
    public static boolean prime[] = new boolean[1000001];
    public static void sieve(){
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
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        Set<Integer> listA = new TreeSet<>();
        sieve();
        for(Integer i:a){
            if(prime[i]){
                listA.add(i);
            }
        }

        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) in.readObject();
        Set<Integer> listB = new TreeSet<>();
        for(Integer i:b){
            if(prime[i]){
                listA.add(i);
            }
        }
//        for(int i = 0; i < listA.size(); i++){
//            for(int j = i+1; j < listA.size(); j++){
//                if(listA. + listA.get(j) == 1000000 && listA.get(i) < listA.get(j) && !listB.contains(listA.get(i)) && !listB.contains(listA.get(j))){
//                    System.out.println(listA.get(i) + " " + listA.get(j));
//                }
//            }
//        }

    }
}
