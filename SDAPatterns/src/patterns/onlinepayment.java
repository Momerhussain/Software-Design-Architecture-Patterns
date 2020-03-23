
package patterns;


public class onlinepayment {
       //create an object of SingleObject 
   private static onlinepayment instance = new onlinepayment(); 
 
   //make the constructor private so that this class cannot be 
   //instantiated 
   private onlinepayment(){} 
 
   //Get the only object available 
   public static onlinepayment getInstance(){ 
      return instance; 
   } 
 
   public void showMessage(){ 
         System.out.println("Hello World!"); 
   } 

 

 }

