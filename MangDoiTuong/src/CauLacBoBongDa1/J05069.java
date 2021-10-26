package CauLacBoBongDa1;

import java.util.ArrayList;
import java.util.Scanner;

public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Club> listClub = new ArrayList<>();
        while (t-- > 0){
            Club c = new Club(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listClub.add(c);
        }
        ArrayList<Match> listMatch = new ArrayList<>();

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String s = sc.nextLine();
            Match m = new Match(s.split("\\s+")[0], Integer.parseInt(s.split("\\s+")[1]));
            for(Club c: listClub){
                if(c.getId().compareTo(m.idClub()) == 0){
                    System.out.println(new Match(c.getId(), c.getName(), c.getPriceTicket(), m.getId(), m.getNumberFans()));
                }
            }
        }
//        for(Club c: listClub){
//            for(Match m: listMatch){
//                if(c.getId().compareTo(m.idClub()) == 0){
//                    System.out.println(new Match(c.getId(), c.getName(), c.getPriceTicket(), m.getId(), m.getNumberFans()));
//                }
//            }
//        }

    }
}
