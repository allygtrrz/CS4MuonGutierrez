/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02muongutierrez;
/**
 *
 * @author Ally
 */
    import java.util.Scanner;
public class Ex02MuonGutierrez {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guesses = 3;
        String choice, again;
        
        do {
            System.out.println("Welcome to Higher or Lower! What will you do?\n" +
                "-Start game\n" +
                "-Change settings\n" +
                "-End application\n");
            choice = sc.nextLine();
        
            switch(choice) {
                case ("Start game"):
                    int random = (int) Math.floor(Math.random()*10) + 1;
                    
                    do {
                        System.out.print("You have " + guesses + " guess(es) left. What is your guess? ");
                        int guess = Integer.parseInt(sc.nextLine());
                        guesses--;
                        
                        if (guesses == 0) {
                            System.out.print("You lost...\n");
                            break;
                        }
                        else {
                            if (guess == random) {
                                System.out.print("You got it!\n");
                                break;
                            }
                            else if (guess < random) {
                                System.out.print("Guess higher! ");
                            }
                            else if (guess > random) {
                                System.out.print("Guess lower! ");
                            }
                        }
                    } while (guesses != 0);
                    
                    break;
                case ("Change settings"):
                    System.out.print("How many guesses are allowed? ");
                    guesses = Integer.parseInt(sc.nextLine());
                    break;
                case ("End application"):
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                    break;
            }
            
            System.out.print("\nRun again? (y/n) ");
            again=sc.nextLine();
        } while (again.equalsIgnoreCase("y"));
    }
}
