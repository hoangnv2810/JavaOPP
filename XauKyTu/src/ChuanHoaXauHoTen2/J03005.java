package ChuanHoaXauHoTen2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class J03005 {
    public static String chuanHoa(String s){
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        String tmp = st.nextToken();
        String firstName = tmp.toUpperCase();
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            ans.append(Character.toUpperCase(word.charAt(0)));
            for(int i = 1; i < word.length(); i++){
                ans.append(Character.toLowerCase(word.charAt(i)));
            }
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        ans.append(", "+firstName);
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}
