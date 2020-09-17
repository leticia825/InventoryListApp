/** This program represents OnlineArticle, an electronic text that tracks 
* word count and etc of OnlineTextItem and InventoryItem.
* @author Leticia Garcia
* @version 9.16.2020 */

public class OnlineArticle extends OnlineTextItem {
   private int wordCount;

/** contructor.
* @param nameIn String
* @param priceIn double */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

/** setWordCount.
* @param wordCountIn int */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}


