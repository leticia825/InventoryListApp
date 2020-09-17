/** This program represents InventoryItem.
* @author Leticia Garcia
* @version 9.16.2020 */

public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;

/** constructor.
* @param nameIn String
* @param priceIn double */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

/** getName.
* @return name */
   public String getName() {
      return name;
   }

/** calculateCost.
* @return price double */
   public double calculateCost() {
      return price * (1 + taxRate);
   }

/** setTaxRate.
* @param taxRateIn double */

   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }

/** toString.
* @return output String */
   public String toString() {
      String output = name + ": $" + calculateCost();
      return output;
   }

}