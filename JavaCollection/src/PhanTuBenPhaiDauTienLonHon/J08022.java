package PhanTuBenPhaiDauTienLonHon;

import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int[] res = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i = n-1; i >= 0; i--){
                while (!st.isEmpty() && a[i] >= a[st.peek()]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    res[i] = a[st.peek()];
                } else {
                    res[i] = -1;
                }
                st.push(i);
            }
            for(int i = 0; i < n; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
