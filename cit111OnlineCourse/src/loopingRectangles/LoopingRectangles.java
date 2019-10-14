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
public class LoopingRectangles {

    public static void main(String[] args) {
        int rowCount = 10;
        int rowPosition = 0;
        int heightCount = 15;
        int heightPosition = 0;
        String symbol = "$";

        while (heightPosition < heightCount) {
            while (rowPosition < rowCount) {
                System.out.print(symbol);
                rowPosition = rowPosition + 1;
            }//inter while 
            System.out.println();
            heightPosition = heightPosition + 1;

            rowPosition = 0;
        }//outer while rep. height
    }//main method
}//class
