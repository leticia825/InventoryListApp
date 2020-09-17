/** This program represents OnlineTextItem, a concept of item amount.
* @author Leticia Garcia
* @version 9.16.2020 */

public abstract class OnlineTextItem extends InventoryItem {

/** constructor.
* @param nameIn String
* @param priceIn double */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

/** calculateCost items not taxed.
* @return price */
   public double calculateCost() {
      return price;
   }

}