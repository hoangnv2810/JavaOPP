package DuaXeDap;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05015 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> listTs = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            listTs.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(listTs);
        for(ThiSinh ts:listTs){
            System.out.println(ts);
        }
    }
}
