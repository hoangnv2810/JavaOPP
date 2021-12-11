package binary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.txt"));
        while (in.available() > 0){
            Person s = (Person) in.readObject();
            System.out.println(s.toString());
        }
    }
}
