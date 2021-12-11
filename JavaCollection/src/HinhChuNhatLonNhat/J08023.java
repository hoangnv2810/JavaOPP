package HinhChuNhatLonNhat;

import java.util.Scanner;
import java.util.Stack;

public class J08023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            int i = 0, tmp;
            long maxTop = 0, res = -1;
            while (i < n){
                if(st.isEmpty() || a[i] >= a[st.peek()]){
                    st.push(i++);
                } else {
                    tmp = st.peek();
                    st.pop();
                    if(st.isEmpty()){
                        maxTop = a[tmp]*i;
                    } else {
                        maxTop = a[tmp]*(i-1-st.peek());
                    }
                    res = Math.max(maxTop, res);
                }
            }
            while (!st.isEmpty()){
                tmp = st.peek();
                st.pop();
                if(st.isEmpty()){
                    maxTop = a[tmp]*i;
                } else {
                    maxTop = a[tmp]*(i-1-st.peek());
                }
                res = Math.max(maxTop, res);
            }
            System.out.println(res);
        }
    }
}
