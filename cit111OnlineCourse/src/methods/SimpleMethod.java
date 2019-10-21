/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author zachary.charlton
 */
public class SimpleMethod {

    public static void main(String[] args) {
        System.out.println("This code is inside method: main");
        //call method printstatement, execution transfer to that block
        //second method stackes
        printStatement();
        System.out.println("After method: main");
        generateBigNumber();
    }

    public static void printStatement() {
        System.out.println("*******INSIDE printStatement******");
        System.out.println("Where there is hope, there's a way");
        System.out.println("**********************************");

    }//close method printSpecialStatement

    //generate big number
    public static void generateBigNumber() {
        System.out.println("*****INISIDE generateBigNumber*****");
        //create a freindly random # generator
        Random r = new Random();
        //create an object to do math
        BigInteger bigInt = new BigInteger(150, r);
        //display the random generate huge #
        System.out.println(bigInt);
        System.out.println("**********************************");
    }//close method generateBigNumber

}//close class

