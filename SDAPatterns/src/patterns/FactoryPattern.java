/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;


public class FactoryPattern {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PaymentFactory paymentFactory = new PaymentFactory(); 
 
      
      OnlinePayment buying = paymentFactory.getOnlinePayment("BUYING"); 
      buying.Payment();
 
      OnlinePayment selling = paymentFactory.getOnlinePayment("SELLING"); 
      selling.Payment();
      
      OnlinePayment paying = paymentFactory.getOnlinePayment("PAYING"); 
      paying.Payment();
      
      OnlinePayment security = paymentFactory.getOnlinePayment("SECURITY OF PAYMENT"); 
      security.Payment();
   } 
}
