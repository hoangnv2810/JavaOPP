package binary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex5 {
    public static void main(String[] args) throws IOException {
//        String s = "Hello JavaFile";
//        byte a[] = s.getBytes();
        Person a = new Person("Nguyen Van Hoang", "Ha Nam");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.txt"));
        out.writeObject(a);
          Person b = new Person("Nguyen Van Hoang", "Ha Nam");
        out.writeObject(b);
        out.close();

    }
}
