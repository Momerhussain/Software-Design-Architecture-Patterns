/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;

public class NullPatternDemo {
       public static void main(String[] args) {

      Customer customer1 = CustomerDatabase.getCustomer("Omer");
      Customer customer2 = CustomerDatabase.getCustomer("Ali");
      Customer customer3 = CustomerDatabase.getCustomer("Abdullah");
      Customer customer4 = CustomerDatabase.getCustomer("Areeb");
      Customer customer5 = CustomerDatabase.getCustomer("Shuja");

      System.out.println("Customers Available!!");
      System.out.println("----------------------");
      System.out.println(customer1.getName());
      System.out.println(customer2.getName());
      System.out.println(customer3.getName());
      System.out.println(customer4.getName());
      System.out.println(customer5.getName());
   }
}
