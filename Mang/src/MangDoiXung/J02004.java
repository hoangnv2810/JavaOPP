package MangDoiXung;
import java.util.Scanner;

public class J02004 {
    public static boolean solution(int[] a){
        int left = 0, right = a.length-1;
        while(left <= right){
            if(a[left] != a[right]) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if(solution(a) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
