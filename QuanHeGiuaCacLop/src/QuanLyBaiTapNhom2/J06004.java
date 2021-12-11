package QuanLyBaiTapNhom2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J06004 {
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
        for(int i = 1; i <= m; i++){
            String tmp = sc.nextLine();
            for(Student st: listStudent){
                if(st.getIdGroup().compareTo(String.valueOf(i)) == 0){
                    listGroup.add(new Group(String.valueOf(i), tmp, st));
                }
            }
        }
        Collections.sort(listGroup);
        for(Group g: listGroup){
            System.out.println(g);
        }
    }
}
