/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

public class PaymentFactory {
    public OnlinePayment getOnlinePayment(String paymentType){ 
      if(paymentType == null)
        { 
         return null;
        } 
      if(paymentType.equalsIgnoreCase("BUYING"))
        { 
         return new Buying(); 
        } 
      else if(paymentType.equalsIgnoreCase("SELLING"))
        { 
         return new Selling(); 
        } 
      else if(paymentType.equalsIgnoreCase("PAYING"))
        { 
         return new Paying();      
        }
      else if(paymentType.equalsIgnoreCase("SECURITY OF PAYMENT"))
        { 
         return new SecuringPayment();      
        }
      return null;   } 
}
