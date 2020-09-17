/** This program is the driver class with main method.
* @author Leticia Garcia
* @version 9.16.2020 */

public class InventoryListApp {

/** instantiate and print myItems. 
@param arg String not used */
   public static void main(String[] arg) {
   
      ItemsList myItems = new ItemsList(); 
      
      InventoryItem.setTaxRate(0.05);
   
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
   
      System.out.print(myItems);  // implicitly calling tostring
      System.out.println("\nTotal: " + myItems.calculateTotal(2.0));
   }

}