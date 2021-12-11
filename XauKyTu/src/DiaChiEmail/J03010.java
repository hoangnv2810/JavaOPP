package DiaChiEmail;

import java.util.*;

public class    J03010 {
    static Map<String, Integer> mp = new HashMap<>();
    public static String chuaHoaEmail(String s){
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        int cnt = st.countTokens();
        while(cnt-- > 1){
            String word = st.nextToken();
            ans.append(Character.toLowerCase(word.charAt(0)));
        }
        String lastName = st.nextToken().toLowerCase().concat(ans.toString());
        StringBuilder res = new StringBuilder();
        res = res.append(lastName);
        if(mp.containsKey(lastName)){
            String repeat = String.valueOf(mp.get(lastName)+1);
            mp.put(lastName, mp.get(lastName)+1);
            res = res.append(repeat);
        } else {
            mp.put(lastName, 1);
        }
        return res.append("@ptit.edu.vn").toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(chuaHoaEmail(s));
        }
    }
}
