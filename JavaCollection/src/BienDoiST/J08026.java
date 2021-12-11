package BienDoiST;

import java.util.*;

public class J08026 {
    public static boolean[] vs = new boolean[10000];
    public static int solution(int x, int y){
        Queue<Node> nd = new LinkedList<>();
        nd.add(new Node(x, 0));
        Arrays.fill(vs, false);
        vs[x] = true;
        while (nd.peek().getValue() != y){
            Node n = nd.peek();
            nd.poll();
            if(n.getValue()*2 < 10000 && vs[n.getValue()*2] == false){
                nd.add(new Node(n.getValue()*2, n.getLevel()+1));
                vs[n.getValue()*2] = true;
            }
            if(n.getValue()-1 > 0 && vs[n.getValue()-1] == false){
                nd.add(new Node(n.getValue()-1, n.getLevel()+1));
                vs[n.getValue()-1] = true;
            }
        }
        return nd.peek().getLevel();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(solution(x, y));
        }
    }
}
