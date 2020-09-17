/** This program hold;s array of InventoryItem objects.
* @author Leticia Garcia
* @version 9.16.2020 */

public class ItemsList {

   private InventoryItem[] inventory;  
   private int count;

/** constructor. */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }

/** addItem.
@param itemIn InventoryItem */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
/** calcTotal.
@param electronicsSurcharge double
@return total double */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge; 
         }
         else {
         
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
/** toString.
@return output String */
   public String toString() {
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }

}