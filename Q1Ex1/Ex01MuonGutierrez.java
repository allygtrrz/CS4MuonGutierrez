/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01muongutierrez;
/**
 *
 * @author MUON
 */
public class Ex01MuonGutierrez {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // header
        System.out.print("Favorite Formula 1 Drivers\n");
        
        // driver 1 information
        int driverNum1 = 16;
        String name1 = "Charles Leclerc";
        String team1 = "Scuderia Ferrari";
        String nat1 = "Monegasque";
        int exp1 = 5;
        int podiums1 = 20;
        int wins1 = 5;
        
        // driver 2 information
        int driverNum2 = 55;
        String name2 = "Carlos Sainz";
        String team2 = "Scuderia Ferrari";
        String nat2 = "Spanish";
        int exp2 = 8;
        int podiums2 = 13;
        int wins2 = 1;
        
        // driver 3 information
        int driverNum3 = 44;
        String name3 = "Lewis Hamilton";
        String team3 = "Mercedes-AMG Petronas";
        String nat3 = "British";
        int exp3 = 16;
        int podiums3 = 188;
        int wins3 = 103;
        
        // driver 1 output statements
        System.out.print("\n#1\n");
        System.out.print("Driver number: " + driverNum1 + "\n");
        System.out.print("Name: " + name1 + "\n");
        System.out.print("Team: " + team1 + "\n");
        System.out.print("Nationality: " + nat1 + "\n");
        System.out.print("Years in Formula 1: " + exp1 + "\n");
        System.out.print("Podiums: " + podiums1 + "\n");
        System.out.print("Wins: " + wins1 + "\n");
        
        // driver 2 output statements
        System.out.print("\n#2\n");
        System.out.print("Driver number: " + driverNum2 + "\n");
        System.out.print("Name: " + name2 + "\n");
        System.out.print("Team: " + team2 + "\n");
        System.out.print("Nationality: " + nat2 + "\n");
        System.out.print("Years in Formula 1: " + exp2 + "\n");
        System.out.print("Podiums: " + podiums2 + "\n");
        System.out.print("Wins: " + wins2 + "\n");
        
        // driver 3 output statements
        System.out.print("\n#3\n");
        System.out.print("Driver number: " + driverNum3 + "\n");
        System.out.print("Name: " + name3 + "\n");
        System.out.print("Team: " + team3 + "\n");
        System.out.print("Nationality: " + nat3 + "\n");
        System.out.print("Years in Formula 1: " + exp3 + "\n");
        System.out.print("Podiums: " + podiums3 + "\n");
        System.out.print("Wins: " + wins3 + "\n");
        
        // performing operations
        // operation: remainder
        System.out.print("\nCharles Leclerc has an even driver number: ");
            if (driverNum1 % 2 == 0) {
                System.out.print("true\n");
            } else
                System.out.print("false\n");
        // operation: comparison
        System.out.print("Charles Leclerc and Carlos Sainz drive for the same team: ");
            if (team1 == team2) {
                System.out.print("true\n");
            } else
                System.out.print("false\n");
        // operation: comparison
        System.out.print("Charles Leclerc, Carlos Sainz, and Lewis Hamilton are all of the same nationality: ");
            if (nat1 == nat2 && nat2 == nat3 && nat1 == nat3) {
                System.out.print("true\n");
            } else
                System.out.print("false\n");
        // operations: sum, comparison
        System.out.print("Lewis Hamilton has more podiums than Charles Leclerc and Carlos Sainz combined: ");
            if (podiums3 > (podiums1 + podiums2)) {
                System.out.print("true\n");
            } else
                System.out.print("false\n");
        // operations: sum, comparison
        System.out.print("Lewis Hamilton has more wins than Charles Leclerc and Carlos Sainz combined: ");
            if (wins3 > (wins1 + wins2)) {
                System.out.print("true\n");
            } else
                System.out.print("false\n");
    }
}