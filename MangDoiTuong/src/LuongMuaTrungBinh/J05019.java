package LuongMuaTrungBinh;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05019 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tram> listTram = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine();
            Tram t = new Tram(i, ten, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            listTram.add(t);
            boolean check = false;
            for (Tram tram : listTram) {
                if (tram.getTen().compareTo(ten) == 0 && tram != t) {
                    long soPhut = tram.getSoPhut() + t.getSoPhut();
                    long soLuongMua = tram.getSoLuongMua() + t.getSoLuongMua();
                    tram.setSoPhut(soPhut);
                    tram.setSoLuongMua(soLuongMua);
                    check = true;
                    break;
                }

            }

            if(check){
                listTram.remove(t);
            }
        }
        for (Tram tram : listTram) {
            System.out.println(tram);
        }
    }
}

