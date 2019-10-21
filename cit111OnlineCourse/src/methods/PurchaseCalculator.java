/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 *
 * @author zachary.charlton
 */
public class PurchaseCalculator {

    public static void main(String[] args) {
        final double ITEM_PRICE = 100.00;
        double discount = 0.20;
        double purchaseLimit;
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        System.out.println("Enter your purchase limit and press enter (no $):");
        //create scanner (point to its variables)
        Scanner s = new Scanner(System.in);
        //read in double value from the user and store in purch.Lim.
        purchaseLimit = s.nextDouble();
        displayPriceWithTax(ITEM_PRICE);
        displayPriceWithTax(1000);
        computePriceAfterDiscount(ITEM_PRICE, discount);
        displayPurchasableNumber(ITEM_PRICE, purchaseLimit);
        //integers can also be used
    }

    public static void displayPriceWithTax(double price) {
        final double TAX_RATE = 0.075;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }//close method w/ tax

    public static void computePriceAfterDiscount(double price, double discount) {
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    }//close computePriceAfterDiscount

    public static void displayPurchasableNumber(double price, double limit) {
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("Max $" + limit 
                + ", you may purchase " + numPurchasable + " units");
    }//close displaypurch.#
}//close class
