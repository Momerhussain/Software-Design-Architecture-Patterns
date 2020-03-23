/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;

public class CustomerDatabase {
       public static final String[] names = {"Omer", "Abdullah", "Areeb"};

   public static Customer getCustomer(String name){
   
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RegisterCustomer(name);
         }
      }
      return new UnRegisterCustomer();
   }
}
