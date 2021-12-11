package Test;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // Doc ghi file van bang
//        PrintWriter out = new PrintWriter(new File("out.txt"));
//        for(int i = 0; i < 100000; i++){
//            out.println(i);
//        }
//        out.close();

//        File file = new File("out.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNext()){
//            System.out.println(sc.nextInt());
//        }

        // Doc ghi file voi FileOutputStream -- Doc ghi theo tung byte mot
//        FileOutputStream out = new FileOutputStream(new File("outFOS.txt"));
//        for(int i = 0; i < 100000; i++){
//            out.write(i);
//        }
//        out.close();

//        FileInputStream in = new FileInputStream(new File("outFOS.txt"));
//        int x = 0;
//        while ((x = in.read()) != -1){
//            System.out.println(x);
//        }

        // Doc ghi file voi DataOutputStream -- Doc ghi bang cach gop nhieu byte
//        DataOutputStream out = new DataOutputStream(new FileOutputStream("songuyen.txt"));
//        for(int i = 0; i < 100000; i++){
//            out.writeInt(i);
//        }
//        out.close();

//        DataInputStream in = new DataInputStream(new FileInputStream("songuyen.txt"));
//        for(int i = 0; i < 100000; i++){
//            System.out.println(in.readInt());
//        }

        // Doc ghi file voi BufferedOutputStream --
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("snt.txt"));
        for(int i = 0; i < 1000000000; i++){
            out.write(i);
        }
        out.close();

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("snt.txt"));
        int x = 0;
        while((x = in.read()) != -1){
            System.out.println(x);
        }
    }
}
