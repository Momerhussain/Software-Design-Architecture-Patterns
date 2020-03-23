
package addapterpatterndemo;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String pname;
   
   private int price;
   private List<Product> plist;

   // constructor
   public Product(String pname, int price) {
      this.pname = pname;
      
      this.price = price;
     plist = new ArrayList<Product>();
   }

   public void add(Product e) {
      plist.add(e);
   }

   public void remove(Product e) {
      plist.remove(e);
   }

   public List<Product> getplist(){
     return plist;
   }

   public String toString(){
      return ("PRODUCT :[ Name :  " + pname + " ,   PRICE:" + price+"]");
   }   

}
