package ChuanHoaXauHoTenTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()){
            String tmp = sc.nextLine();
            if(tmp.compareTo("END") == 0){
                break;
            }
            System.out.println(chuanHoa(tmp));
        }
    }

    private static String chuanHoa(String s){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            String tmp = st.nextToken();
            sb.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                sb.append(Character.toLowerCase(tmp.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
