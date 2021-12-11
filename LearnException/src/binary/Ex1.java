/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author hn281
 */
public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream out = new FileOutputStream("songuyen.txt");
        for(int i = 0; i < 1000; i++){
            out.write(i);
        }
        out.close();
    }
}
