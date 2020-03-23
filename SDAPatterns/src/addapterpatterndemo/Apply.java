package addapterpatterndemo;
public class Apply {
    public static void main(String[] args){

        Calculation chainCalc1 = new AddNumber();

        Calculation chainCalc2 = new sUB();

        Calculation chainCalc3 = new Mult();

        Calculation chainCalc4 = new Div();

        chainCalc1.setNextChain(chainCalc2);

        chainCalc2.setNextChain(chainCalc3);
        // Define the data in the Numbers Object
        Numbers request = new Numbers(4,2,"sub");
        chainCalc1.calculate(request);
     
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        Numbers request1 = new Numbers(2,3,"mult");
        chainCalc1.calculate(request1);
        
        
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        Numbers request2 = new Numbers(2,10,"add");
        chainCalc1.calculate(request2);
        
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc4);
        Numbers request3 = new Numbers(10,5,"div");
        chainCalc1.calculate(request3);

}}
