/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author zachary.charlton
 */
public class Score {

    private int playerOnePoints = 0;
    private int playerTwoPoints = 0;

    public void displayScores() {
        System.out.println("Player 1 Score: " + playerOnePoints);
        System.out.println("Player 2 Score: " + playerTwoPoints);
    }

    public void addPoints() {

        int turnCount = turnCounter();
        int turnCheck = turnCount % 2;

        if (turnCheck == 0) {
            playerOnePoints++;
            checkScores(playerOnePoints, playerTwoPoints);
        } else if (turnCheck != 0) {
            playerTwoPoints++;
            checkScores(playerOnePoints, playerTwoPoints);
        }

    }

    public static int turnCounter() {
        int numberTurns = 0;
        numberTurns++;
        return numberTurns;
    }

    public static void checkScores(int playerOnePoints, int playerTwoPoints) {
        if (playerOnePoints >= 10 || playerTwoPoints >= 10) {
            if (playerOnePoints > playerTwoPoints) {
                System.out.println("PLAYER 1 WINS");
            } else {
                System.out.println("PLAYER 2 WINS");
            }
        }
    }
}


