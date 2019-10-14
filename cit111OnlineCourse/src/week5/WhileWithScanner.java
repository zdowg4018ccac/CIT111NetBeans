/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author zachary.charlton
 */
public class WhileWithScanner {
    public static void main(String[] args){
        int numLoops = 10;
        int loopControl = 20;
        //build a scanner object
        Scanner scanner = new Scanner(System.in);
        //prompt user and get int from them
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        while(numLoops <= loopControl){
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        }
        System.out.println("... After the while loop");
        
        }
    }

