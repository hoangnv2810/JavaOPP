package DiemDanh2;

import java.util.ArrayList;
import java.util.Scanner;

public class J05075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int q = t;
        ArrayList<Student> listSt = new ArrayList<>();
        while (t-- > 0) {
            Student st = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSt.add(st);
        }
        ArrayList<String> listRC = new ArrayList<>();
        while (q-- > 0) {
            String tmp = sc.nextLine();
            listRC.add(tmp);
        }
        String className = sc.nextLine();
        for (Student st : listSt) {
            if (st.getClassName().compareTo(className) == 0) {
                for (String tmp : listRC) {
                    String id = tmp.split("\\s+")[0];
                    String rc = tmp.split("\\s+")[1];
                    if (st.getId().compareTo(id) == 0) {
                        System.out.println(new Student(id, st.getName(), st.getClassName(), rc));
                    }
                }
            }
        }

    }
}
