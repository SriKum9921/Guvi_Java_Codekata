/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlphabetRnot;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class AlphabetRnot {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        if(((c<='Z')&&(c>='A'))||((c<='z')&&(c>='a'))){
            System.out.println("Alphabet");
        }
        else 
            System.out.println("Not an alphabet");
    }
    
}
