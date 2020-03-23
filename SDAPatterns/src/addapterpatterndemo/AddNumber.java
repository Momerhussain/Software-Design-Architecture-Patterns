/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;

public class AddNumber implements Calculation{
        private  Calculation nextInChain;

    public void setNextChain(Calculation nextChain) {

        nextInChain = nextChain;

    }
  public void calculate(Numbers request) {

        if(request.getCalcWanted() == "add"){

            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+

                    (request.getNumber1()+request.getNumber2())+"\n");

        } else {

            nextInChain.calculate(request);

        }

    }
}
