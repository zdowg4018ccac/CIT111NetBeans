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
public class LoopingPractice {

    public static void main(String[] whateverNameWeWant) {
        int count = 0;
        int numLoops = 600001;
        long startTime = System.currentTimeMillis();
        long endTime;

        System.out.println("Before loooping at: " + startTime);

        // as long as count < numLoops,
        //execute my block (...)
        while (count < numLoops) {
            System.out.println("Val of Count" + count);
            count++;
        }
        System.out.println("After looping");
        endTime = System.currentTimeMillis();
        System.out.println("Stopped looping at: " + endTime);
        long finalTime = endTime - startTime;
        System.out.println("Total time running is: " + finalTime);
    }

}
