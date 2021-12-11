/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream("1.jpg");
        int x = 0;
        while((x = in.read()) != -1){
            System.out.println(x);
        }
    }
            
}
