/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingRectangles;
/**
 *
 * @author zachary.charlton
 */
import java.util.Scanner;
public class LoopingRec1 {
    public static void main(String[] args){
        String marker = "%"; 
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" Enter a max width ");
        int widthMax = inputScanner.nextInt();
        int widthPosition = 0;
        System.out.println(" Enter Max Height ");
        int heightMax = inputScanner.nextInt();
        int heightPosition = 0;
        
        if(heightPosition >= 0 || widthPosition >= 0){
            while(heightPosition <= heightMax){
                while(widthPosition <= widthMax){
                System.out.print(marker);
                widthPosition++;
            }//inter while
            System.out.println("");
            heightPosition++;
            widthPosition = 0;
            }//outer while
        } else {
                System.out.println(" Height and width can't be negative try again!");
                }
    }//main method
}//class
