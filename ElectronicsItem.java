/** This program represents ElectronicsItem. 
* This has characteristics of InventoryItem and will account for shipping cost.
* @author Leticia Garcia
* @version 9.16.2020 */

public class ElectronicsItem extends InventoryItem {

   protected double weight;
   
 /** constant. */
   public static final double SHIPPING_COST = 1.5;

/** constructor.
* @param nameIn String
* @param priceIn double 
* @param weightIn double */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

/** calculateCost.
* @return double */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }

}