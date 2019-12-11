/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author zachary.charlton
 */
public class Questions {

    public static void entQuestions(int randNumber) {
        Scanner responder = new Scanner(System.in);
        int randNum = randNumber;
        String[] eQuestions = new String[5];
        eQuestions[0] = "Which of these games was created in Russia? ";
        eQuestions[1] = "What is the highest grossing movie of all time? ";
        eQuestions[2] = "Who directed the film Inception? ";
        eQuestions[3] = "What is the longest running animated TV show? ";
        eQuestions[4] = "What year did Pokemon debut? ";

        if (randNum == 0) {
            System.out.println("Question is: " + eQuestions[0]);
            System.out.println("A: Super Mario Bros ");
            System.out.println("B: Tetris ");
            System.out.println("C: Pong ");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Super Mario Bros";
                    System.out.println("Answer is Incorrect!");
                    //ControlGame.continueGame();
                    break;

                case "B":
                    response = "Tetris";
                    System.out.println("Answer is Correct!");
                    //Score.addPoints();
                    //ControlGame.continueGame();
                    break;

                case "C":
                    response = "Pong";
                    System.out.println("Answer is Incorrect!");
                    //ControlGame.continueGame();
                    break;

            }
        }

        if (randNum == 1) {
            System.out.println("Question is: " + eQuestions[1]);
            System.out.println("A: Avatar");
            System.out.println("B: Avengers:Endgame");
            System.out.println("C: Star Wars");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Avatar";
                    System.out.println("Incorrect!");
                    //ControlGame.continueGame();
                    break;
                case "B":
                    response = "Avnegers:Endgame";
                    System.out.println("CORRECT!");
                    //Score.addPoints();
                    //ControlGame.continueGame();
                    break;
                case "C":
                    response = "Star Wars";
                    System.out.println("Incorrect");
                   // ControlGame.continueGame();
                    break;
            }
        }

        if (randNum == 2) {
            System.out.println("Question is: " + eQuestions[2]);
            System.out.println("A:Christopher Nolan ");
            System.out.println("B:Joss Whedon ");
            System.out.println("C:Ryan Johnson ");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Christopher Nolan";
                    System.out.println("CORRECT!");
                    //Score.addPoints();
                   // ControlGame.continueGame();
                    break;
                case "B":
                    response = "Joss Whedon";
                    System.out.println("Incorrect");
                    //ControlGame.continueGame();
                    break;
                case "C":
                    response = "Ryan Johnson";
                    System.out.println("Incorrect");
                    //ControlGame.continueGame();
                    break;
            }
        }

        if (randNum == 3) {
            System.out.println("Question is: " + eQuestions[3]);
            System.out.println("A:Family Guy ");
            System.out.println("B:South Park ");
            System.out.println("C:The Simpsons ");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Family Guy";
                    System.out.println("Incorrect");
                    //ControlGame.continueGame();
                    break;
                case "B":
                    response = "South Park";
                    System.out.println("Incorrect");
                    //ControlGame.continueGame();
                    break;
                case "C":
                    response = "The Simpsons";
                    System.out.println("CORRECT!");
                    //Score.addPoints();
                    //ControlGame.continueGame();
                    break;
            }
        }

        if (randNum == 4) {
            System.out.println("Question is: " + eQuestions[4]);
            System.out.println("A:1990 ");
            System.out.println("B:2010 ");
            System.out.println("C:1996 ");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "1990";
                    System.out.println("Incorrect");
                    //ControlGame.continueGame();
                    break;
                case "B":
                    response = "2010";
                    System.out.println("incorrect");
                    //ControlGame.continueGame();
                    break;
                case "C":
                    response = "1996";
                    System.out.println("CORRECT");
                    //Score.addPoints();
                    //ControlGame.continueGame();
                    break;
            }
        }

    }

    public static void historyQuestions(int randNumber) {
        Scanner responder = new Scanner(System.in);
        int randNum = randNumber;
        String[] histQuestions = new String[5];
        histQuestions[0] = "What war was known as the great war? ";
        histQuestions[1] = "What year did WWII end? ";
        histQuestions[2] = "Which of these countries was part of the axis powers? ";
        histQuestions[3] = "What date was the first moon landing? ";
        histQuestions[4] = "What two major powers were involved in the space race? ";

        if (randNum == 0) {
            System.out.println("Question is: " + histQuestions[0]);
            System.out.println("A: WWI ");
            System.out.println("B: The Civil War ");
            System.out.println("C: The Star War ");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "WWI";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "The Civil War";
                    System.out.println("Incorrect");
                    //Score.addPoints();
                    break;
                case "C":
                    response = "The Star War";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 1) {
            System.out.println("Question is: " + histQuestions[1]);
            System.out.println("A: 1945");
            System.out.println("B: 2000");
            System.out.println("C: 1812");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "1945";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "2000";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "1812";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 2) {
            System.out.println("Question is: " + histQuestions[2]);
            System.out.println("A: Russia");
            System.out.println("B: Japan");
            System.out.println("C: China");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Russia";
                    System.out.println("Incorrect");
                    break;
                case "B":
                    response = "Japan";
                    System.out.println("CORRECT");
                    break;
                case "C":
                    response = "China";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 3) {
            System.out.println("Question is: " + histQuestions[3]);
            System.out.println("A: July 1969");
            System.out.println("B: April 1998");
            System.out.println("C: January 2000");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "July 1969";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "April 1998";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "January 2000";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 4) {
            System.out.println("Question is: " + histQuestions[4]);
            System.out.println("A: Russia and China");
            System.out.println("B: China and US");
            System.out.println("C: US and Russia");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Russia and China";
                    System.out.println("Incorrect");
                    break;
                case "B":
                    response = "China and US";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "US and Russia";
                    System.out.println("CORRECT");
                    break;
            }
        }

    }

    public static void scienceQuestions(int randNumber) {
        Scanner responder = new Scanner(System.in);
        int randNum = randNumber;
        String[] sciQuestions = new String[5];
        sciQuestions[0] = "What is the powerhouse of the cell? ";
        sciQuestions[1] = "What organ controls glucose levels in the body? ";
        sciQuestions[2] = "Why do plants appear as green? ";
        sciQuestions[3] = "When was JAVA created? ";
        sciQuestions[4] = "What causes an electrical current? ";

        if (randNum == 0) {
            System.out.println("Question is: " + sciQuestions[0]);
            System.out.println("A: Cytoplasm ");
            System.out.println("B: Mitchondria ");
            System.out.println("C: Ribosomes ");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Cytoplasm";
                    System.out.println("Incorrect");
                    break;
                case "B":
                    response = "Mitochondria";
                    System.out.println("CORRECT");
                    //Score.addPoints();
                    break;
                case "C":
                    response = "Ribosomes";
                    System.out.println("incorrect");
                    break;
            }
        }

        if (randNum == 1) {
            System.out.println("Question is: " + sciQuestions[1]);
            System.out.println("A: Pancreas");
            System.out.println("B: Liver");
            System.out.println("C: Kidney");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Pancreas";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "Liver";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "Kidney";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 2) {
            System.out.println("Question is: " + sciQuestions[2]);
            System.out.println("A: They have Chlorophyll");
            System.out.println("B: Their cell wall is green");
            System.out.println("C: They aren't green");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "They have Chlorophyll";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "Their cell wall is green";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "They aren't green";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 3) {
            System.out.println("Question is: " + sciQuestions[3]);
            System.out.println("A: 1995");
            System.out.println("B: 1900");
            System.out.println("C: 2099");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "1995";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "1900";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "2099";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 4) {
            System.out.println("Question is: " + sciQuestions[4]);
            System.out.println("A: Electron Flow");
            System.out.println("B: Proton Flow");
            System.out.println("C: Neutron Flow");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Electron flow";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "Proton Flow";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "Neutron Flow";
                    System.out.println("Incorrect");
                    break;
            }
        }

    }

    public static void artAndLitQuestions(int randNumber) {
        Scanner responder = new Scanner(System.in);
        int randNum = randNumber;
        String[] alQuestions = new String[10];
        alQuestions[0] = "Who wrote the Lord of the Rings series? ";
        alQuestions[1] = "Who painted the Sistine Chapel? ";
        alQuestions[2] = "What issue did Spider-Man first debut in? ";
        alQuestions[3] = "How many Harry Potter books are there? ";
        alQuestions[4] = "What series was the TV show Game of Thrones based on? ";

        if (randNum == 0) {
            System.out.println("Question is: " + alQuestions[0]);
            System.out.println("A: George RR Martin ");
            System.out.println("B: CS Lewis ");
            System.out.println("C: JRR Tolkien ");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "George";
                    System.out.println("Incorrect");
                    break;
                case "B":
                    response = "CS";
                    System.out.println("Incorrect");
                    //Score.addPoints();
                    break;
                case "C":
                    response = "JRR";
                    System.out.println("CORRECT!");
                    break;
            }
        }

        if (randNum == 1) {
            System.out.println("Question is: " + alQuestions[1]);
            System.out.println("A: Leo");
            System.out.println("B: Mikey");
            System.out.println("C: Raph");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Leo";
                    System.out.println("Incorrect");
                    break;
                case "B":
                    response = "Mikey";
                    System.out.println("CORRECT");
                    break;
                case "C":
                    response = "Raph";
                    System.out.println("incorrect");
                    break;
            }
        }

        if (randNum == 2) {
            System.out.println("Question is: " + alQuestions[2]);
            System.out.println("A: Amazing Fantasy #15");
            System.out.println("B: Spider-Man #1");
            System.out.println("C: Avengers #5");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Amazing Fantasy";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "Spider-Man";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "Avengers";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 3) {
            System.out.println("Question is: " + alQuestions[3]);
            System.out.println("A: 7");
            System.out.println("B: 8");
            System.out.println("C: 9");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "7";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "8";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "9";
                    System.out.println("Incorrect");
                    break;
            }
        }

        if (randNum == 4) {
            System.out.println("Question is: " + alQuestions[4]);
            System.out.println("A: A Song of Ice and Fire");
            System.out.println("B: His Dark Materials");
            System.out.println("C: The end of the world");
            System.out.println("Answer: ");
            String response = responder.nextLine();
            switch (response.toUpperCase()) {
                case "A":
                    response = "Ice and Fire";
                    System.out.println("CORRECT");
                    break;
                case "B":
                    response = "Materials";
                    System.out.println("Incorrect");
                    break;
                case "C":
                    response = "The end of the world";
                    System.out.println("Incorrect");
                    break;
            }
        }

    }

    public static void getQuestionSelect(int playerChoice) {
        int category = playerChoice;
        if (category == 1) {
            int randQuest = randomInteger(0, 5);
            entQuestions(randQuest);
        }

        if (category == 2) {
            int randQuest = randomInteger(0, 5);
            historyQuestions(randQuest);
        }
        if (category == 3) {
            int randQuest = randomInteger(0, 5);
            artAndLitQuestions(randQuest);
        }
        if (category == 4) {
            int randQuest = randomInteger(0, 5);
            scienceQuestions(randQuest);
        }
        if (category == 5) {
            System.out.println("Game Over");
        }
    }

    public static int randomInteger(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

}

