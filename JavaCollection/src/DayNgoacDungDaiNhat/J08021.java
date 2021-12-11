package DayNgoacDungDaiNhat;

import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String exp = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0;
            for(int i = 0; i < exp.length(); i++){
                if(exp.charAt(i) == '('){
                    st.push(i);
                } else {
                    st.pop();
                    if(!st.isEmpty()){
                        res = Math.max(res, i-st.peek());
                    } else {
                        st.push(i);
                    }
                }
            }
            System.out.println(res);
        }
    }
}
