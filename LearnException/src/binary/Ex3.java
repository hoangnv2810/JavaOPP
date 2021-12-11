/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;
import java.io.*;
public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("songuyento.txt"));
        for(int i = 0; i < 100000; i++){
            out.writeInt(i);
        }
        out.close();
    }
}
