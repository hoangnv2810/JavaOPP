/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.io.*;
public class Copy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream("A.xlsx");
        FileOutputStream out = new FileOutputStream("B.xlsx");
       
        int x = 0;
        while((x = in.read()) != -1){
            out.write(x);
        }
        
        out.close();
    }
}
