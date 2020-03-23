
package addapterpatterndemo;
public class sUB implements Calculation{
      private  Calculation nextInChain;

    public void setNextChain(Calculation nextChain) {

        nextInChain = nextChain;

    }

    public void calculate(Numbers request) {

         

        if(request.getCalcWanted() == "sub"){

             

            System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = "+

                    (request.getNumber1()-request.getNumber2())+"\n");

        } else {

            nextInChain.calculate(request);

        } }}
