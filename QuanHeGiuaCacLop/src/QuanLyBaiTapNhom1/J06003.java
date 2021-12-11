package QuanLyBaiTapNhom1;

import java.util.ArrayList;
import java.util.Scanner;

public class J06003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s.split("\\s+")[0]);
        int m = Integer.parseInt(s.split("\\s+")[1]);

        ArrayList<Student> listStudent = new ArrayList<>();
        while (n-- > 0) {
            Student st = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listStudent.add(st);
        }

        ArrayList<Group> listGroup = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            Group g = new Group(String.valueOf(i), sc.nextLine());
            listGroup.add(g);
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            int stt = sc.nextInt();
            System.out.println("DANH SACH NHOM " + stt + ":");
            for (Student st : listStudent) {
                if (st.getGroupId().compareTo(String.valueOf(stt)) == 0){
                    System.out.println(st);
                }
            }
            for (Group g : listGroup){
                if(g.getIdGroup().compareTo(String.valueOf(stt)) == 0){
                    System.out.println("Bai tap dang ky: " + g);
                    break;
                }
            }

        }

    }
}
