/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;


public class ShopKeeper {
 
    public static Juice takeOrder(String juiceType) {
 
        JuiceMaker juiceMaker = null;
 
        if (juiceType.equalsIgnoreCase("orange")) {
            juiceMaker = new OrangeJuice();
        } else if (juiceType.equalsIgnoreCase("apple")) {
            juiceMaker = new AppleJuice();
        } else {
            System.out.println("Sorry we don't take order for  " + juiceType);
        }
        return juiceMaker.makeJuice();
    }
 
}
