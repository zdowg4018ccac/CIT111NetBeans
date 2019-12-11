/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.util.Scanner;

/**
 *
 * @author zachary.charlton
 */
public class ControlGame {


    public static void startGame() {
        System.out.println("*****************New Game******************");

        Scanner playerkb = new Scanner(System.in);

        menu();
        int playerChoice = playerkb.nextInt();

        Questions.getQuestionSelect(playerChoice);
        continueGame();
    }

    public static void continueGame() {
        System.out.println("*****************Next Question******************");

        Scanner singPlay = new Scanner(System.in);

        menu();
        int playerChoice = singPlay.nextInt();

        Score.turnCounter();
        Questions.getQuestionSelect(playerChoice);
        continueGame();

    }

    public static void menu() {
        System.out.println("Pick a category: ");
        System.out.println("1 = Entertainment");
        System.out.println("2 = History");
        System.out.println("3 = Arts and Literature");
        System.out.println("4 = Science");
        System.out.println("5 = Quit Game");
        System.out.println(":");
        //prompting menu
    }

}
