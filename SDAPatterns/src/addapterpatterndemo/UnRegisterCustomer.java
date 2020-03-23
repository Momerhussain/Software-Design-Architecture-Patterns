/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;

/**
 *
 * @author pc
 */
public class UnRegisterCustomer extends Customer{
       @Override
   public String getName() {
      return "This Name is Not Available in Customer Database List!";
   }

   @Override
   public boolean isNil() {
      return true;
   }
}
