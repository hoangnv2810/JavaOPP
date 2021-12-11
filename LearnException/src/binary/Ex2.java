/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author hn281
 */
public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream("songuyen.txt");
        long x = 0;
        while((x = in.read()) != -1){
            System.out.println(x);
        }
        
    }
}
