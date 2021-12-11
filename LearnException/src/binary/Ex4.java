/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;
import java.io.*;
public class Ex4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("songuyento.txt"));
        for(int i = 0; i < 100000; i++){
            System.out.println(in.readInt());
        }
    }
}
