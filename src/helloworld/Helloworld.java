/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author 91816
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
String word;
Scanner scan = new Scanner(System.in);

System.out.println("Enter a word");
word = scan.nextLine();

char[]Doggy = word.toCharArray();

System.out.println("Reverse Of Your Word");
for(int i=Doggy.length-1;i>=0;i--)
System.out.print(Doggy[i] + " ");
}
}
    
    

