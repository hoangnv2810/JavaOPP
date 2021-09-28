public class Test {
    public static void main(String[] args) {
//        String s = "aaabcde";
//        String a = s.substring(0, 2);
//        s = s.replace(a, "");
//        System.out.println(s);
        String a = "0", b = "1", c = "";
        int n = 10;
        while(n > 0){
            System.out.printf(a + " ");
            c = a+b;
            a = b;
            b = c;
            n--;
        }
    }
}