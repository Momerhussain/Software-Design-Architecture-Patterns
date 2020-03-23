/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;


public class fact {
    public static void main(String args[]){
        int fac=1,n,k;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number:");
        n=inp.nextInt();
        for(k=1;k<=n;k++){
           fac=fac*k; 
        }
            System.out.println("Factorial is:"+fac);
    }
}
