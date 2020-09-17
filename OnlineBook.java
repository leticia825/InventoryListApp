/** This program represents OnlineBook.
* It has author name & inherits OnlineTextItem.
* @author Leticia Garcia
* @version 9.16.2020 */

public class OnlineBook extends OnlineTextItem {
   protected String author;

/** contructor.
* @param nameIn String
* @param priceIn double */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

/** toString.
* @return output String */
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }

/** setAuthor.
* @param authorIn String */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}