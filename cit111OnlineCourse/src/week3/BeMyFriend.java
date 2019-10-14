package week3;
import java.util.Scanner;
public class BeMyFriend {
    public static void main (String[] args){
        int compScore = 0;
        int response = 0;
        
        System.out.println("Are you religious?");
        Scanner keyboardReader = new Scanner(System.in);
        response = keyboardReader.nextInt();
        if (response == 1){
            compScore = compScore + 10;
            System.out.println("Praize our Lord and Savior, Cheesus");
            
        }else{
            System.out.println("Begone heretic");
        } System.out.println("Do you have a bf or gf?");
        response = keyboardReader.nextInt();
        if (response == 1){
            compScore = compScore + 0;
            System.out.println("Oh ok");
            
        } else if (response == 0){
            compScore = compScore + 15;
            System.out.println("Well, hello there ladies");
        System.out.println("How old are you?");
        if (response >= 18){
            compScore = compScore + 25;
            System.out.println("Cool");
            
        }
        }
    }
            
}
