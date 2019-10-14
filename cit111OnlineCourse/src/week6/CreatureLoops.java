/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author zachary.charlton
 */
public class CreatureLoops {
    public static void main(String[] args){
        int rhinos = 0;
        int snakes = 4;
        while(rhinos <= snakes){
            System.out.println("Rhino: " + rhinos);
            rhinos = rhinos + 1;
        }
        if(rhinos == snakes){
            System.out.println("Equal!");
        }
    }
}  
