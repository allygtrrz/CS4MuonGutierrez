/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02muongutierrez;
/**
 *
 * @author MUON
 */
    import java.util.Scanner;
public class Ex02MuonGutierrez {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guesses = 3;
        
        System.out.println("Welcome to Higher or Lower! What will you do?\n" +
                "-Start game\n" +
                "-Change settings\n" +
                "-End application");
        String response = sc.nextLine();
        switch(response) {
            case "Start game":
                int random = (int) Math.floor(Math.random()*10) + 1;
                for (int remaining = guesses; remaining > 0; remaining--) {
                    System.out.print("You have " + remaining + " guess(es) left. What is your guess? ");
                    int answer = Integer.parseInt(sc.nextLine());
                    if (answer < random) {
                        System.out.print("Guess higher! ");
                    } else if (answer > random) {
                        System.out.print("Guess lower! ");
                    } else if (answer == random) {
                        System.out.print("You got it!");
                        break;
                    } else {
                        System.out.print("You lost...");
                        break;
                    }
                }
                break;
        }
    }
}