/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

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

    }

    public static void printStatement() {
        System.out.println("*******INSIDE printStatement******");
        System.out.println("Where there is hope, there's a way");
        System.out.println("**********************************");

    }//close method printSpecialStatement

    //generate big number
    
}//close class

