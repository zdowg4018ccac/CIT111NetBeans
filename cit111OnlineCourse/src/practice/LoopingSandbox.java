/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author zachary.charlton
 */
public class LoopingSandbox {
    public static void main(String[] javaRocks){
        long time = System.currentTimeMillis();
        System.out.println("Time ms: " + time);
        long seconds = time / 1000;
        System.out.println("Time sec: " + seconds);
        long hours = (seconds /60) /60;
        System.out.println("Time hours: " + hours);
        long days = hours / 24; 
        System.out.println("Days: " + days);
        long years = days / 365;
        System.out.println("Years: " + years);
    } 
}
