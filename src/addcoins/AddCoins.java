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
