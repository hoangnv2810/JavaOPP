package TinhGio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05011 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GameTime> listGameTime = new ArrayList<>();
        while(t-- > 0){
            GameTime g = new GameTime(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listGameTime.add(g);
        }
        Collections.sort(listGameTime);
        for(Gamer gm:listGameTime){
            System.out.println(gm);
        }
    }
}
