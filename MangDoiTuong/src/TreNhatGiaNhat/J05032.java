package TreNhatGiaNhat;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05032 {
    public static void main(String[] args) throws ParseException {
        ArrayList<People> listP = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            People p = new People(sc.next(), sc.next());
            listP.add(p);
        }
        Collections.sort(listP);
        System.out.println(listP.get(0));
        System.out.println(listP.get(listP.size()-1));
    }
}
