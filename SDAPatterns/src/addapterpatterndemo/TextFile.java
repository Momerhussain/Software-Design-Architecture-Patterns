/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;

public class TextFile implements TextEditor{
    ImageAddapter imageaddapter; 
   @Override
   public void Text(String imageType,String fileName) {		
      
      if(imageType.equalsIgnoreCase("txt")){
         System.out.println("Displaying txt file. Name: " + fileName);			
      } 
            
      else if(imageType.equalsIgnoreCase("jpg")){
         imageaddapter = new ImageAddapter(imageType);
         imageaddapter.Text(imageType, fileName);
      }
          else{
         System.out.println("Invalid Image. " + imageType + " format is not supported");
     }   }
}
