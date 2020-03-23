/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

public class BuilderDesignPattern {
    public static void main(String[] args) {
 
        Juice orange = ShopKeeper.takeOrder("orange");
        System.out.println(orange);
 
        Juice apple = ShopKeeper.takeOrder("apple");
        System.out.println(apple);
    }
}
