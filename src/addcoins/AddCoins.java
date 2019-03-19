/*
  Matthew Ludwig
  18 March 2019
  This program calculates the total amount of money, from a specific amount of coins
 */
package addcoins;

/**
 *
 * @author malud0519
 */
import java.util.Scanner;

/**
 * The class Add Coins uses the method getDollarAmount to calculate money
 */
public class AddCoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double loonies, quarters, dimes, nickles;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of coins:" + "\n");
        System.out.println("Loonies: ");
        loonies = input.nextInt();
        System.out.println("Quarters: ");
        quarters = input.nextInt();
        System.out.println("Dimes: ");
        dimes = input.nextInt();
        System.out.println("Nickles: ");
        nickles = input.nextInt();
        System.out.println("Total: $" + getDollarAmount(loonies, quarters, dimes, nickles));
    }
    /**
     * @param loonies: The amount of $1 coins
     * @param quarters: The amount of $0.25 coins
     * @param dimes: The amount of $0.10 coins
     * @param nickles: The amount of $0.05 coins
     * 
     * @return value: The total amount of money
     */
    public static double getDollarAmount (double loonies, double quarters, double dimes, double nickles) {
        double value = 0;
        value += loonies;
        quarters = quarters * 0.25;
        value += quarters;
        dimes = dimes * 0.1;
        value += dimes;
        nickles = nickles * 0.05;
        value += nickles;
        return value;
    }
    
}
