package KiemTraDayNgoacDung;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            boolean check = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                    if(!st.isEmpty() ){
                        if(st.peek() == '(' && s.charAt(i) == ')'){
                            st.pop();
                        } else if(st.peek() == '[' && s.charAt(i) == ']') {
                            st.pop();
                        } else if(st.peek() == '{' && s.charAt(i) == '}'){
                            st.pop();
                        } else {
                            check = false;
                            break;
                        }
                    } else {
                        check = false;
                        break;
                    }
                } else {
                    st.push(s.charAt(i));
                }
            }
            if(check == false){
                System.out.println("NO");
            } else if(st.isEmpty()) {
                System.out.println("YES");
            }
        }
    }
}
