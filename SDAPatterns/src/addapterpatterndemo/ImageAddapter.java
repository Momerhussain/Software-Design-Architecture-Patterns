/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;
public class ImageAddapter implements TextEditor{
    ImageEditor imageeditor;

   public ImageAddapter(String imageType){
   
      if(imageType.equalsIgnoreCase("jpg")){ 
         imageeditor = new ImageFile();
      }
         else 
          System.out.println("Cannot Support This Type");
      }
       
  @Override
   public void Text(String imageType,String fileName) {
   
      if(imageType.equalsIgnoreCase("jpg")){
         imageeditor.ShowImage(fileName);
      }
      else 
          System.out.println("Cannot Support This Type");
      }}