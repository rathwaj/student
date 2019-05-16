/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsdd1;

import java.util.Scanner;

/**
 *
 * @author jayra
 */
public class Fsdd1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter Your Text.");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        char[] name = new char[word.length()];
        System.out.println("length of the text is here   : "+name.length);
        
        for (int i=0; i<word.length(); i++){
        
            name[i] = word.charAt(i);
        }
        System.out.print("Text in reverse is : ");
        for(int i= name.length-1; i >= 0 ; i--)
        {
            System.out.print(name[i]);
        }
        System.out.println(" ");
        // TODO code application logic here
    }

}