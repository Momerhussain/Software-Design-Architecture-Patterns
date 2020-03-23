package addapterpatterndemo;
public class CompositePatternDemo {
    public static void main(String[] args) {
   
     Product TOP = new Product("PEPSI    ",140);

      Product headSales = new Product("COCACOLA ", 130);

      Product sales1 = new Product("SPRITE   ", 120);

      Product sales2 = new Product("DEW      ",110);
      Product lowsales = new Product("7uP      ",100);

      Product sale1 = new Product("FANTA    ", 150);
      Product sale2 = new Product("STING    ",160);

      TOP.add(headSales);
      TOP.add(lowsales);

      headSales.add(sales1);
      headSales.add(sales2);

      lowsales.add(sale1);
      lowsales.add(sale2);
      //print all employees of the organization
      System.out.println(TOP); 
      
      for (Product headProduct : TOP.getplist()) {
         System.out.println(headProduct);
               for (Product product : headProduct.getplist()) {
            System.out.println(product);
         } }		 }}
