package So0Va9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.offer("9");
            String s = "";
            while (!q.isEmpty()){
                s = q.peek();
                q.poll();
                long tmp = Long.parseLong(s);
                if(tmp%n == 0){
                    break;
                }
                q.offer(s+"0");
                q.offer(s+"9");
            }
            System.out.println(s);
        }
    }
}
