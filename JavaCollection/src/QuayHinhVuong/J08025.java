package QuayHinhVuong;

import java.util.*;

public class J08025 {
    public static int solution(int[][] st, int[][] en){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(st, 0));
        Set<int[][]> s = new HashSet<>();
        s.add(q.peek().getMatrix());
        while (!q.peek().equals(new Node(en, 0))){
            Node m = q.peek();
            q.poll();
            if(!s.contains(m.turnLeft().getMatrix())){
                q.add(new Node(m.turnLeft().getMatrix(), m.getLevel()+1));
                s.add(m.turnLeft().getMatrix());
            }
            if(!s.contains(m.turnRight().getMatrix())){
                q.add(new Node(m.turnRight().getMatrix(), m.getLevel()+1));
                s.add(m.turnRight().getMatrix());
            }
        }
        return q.peek().getLevel();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int[][] start = new int[2][3];
            int[][] end = new int[2][3];
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 3; j++){
                    start[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 3; j++){
                    end[i][j] = sc.nextInt();
                }
            }
            System.out.println(solution(start, end));
        }
    }
}
