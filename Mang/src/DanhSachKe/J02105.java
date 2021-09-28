package DanhSachKe;

import java.util.ArrayList;
import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int temp = sc.nextInt();
                if(temp == 1 && j > i){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        for(int i = 0; i < adj.size(); i++){
            System.out.printf("List(%d) = ", i+1);
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+1 + " ");
            }
            System.out.println();
        }
    }
}
