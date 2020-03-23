/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;

public class ImageFile implements ImageEditor{
    @Override
   public void ShowImage(String fileName) {
      System.out.println("Displaying Image file. Name: "+ fileName);
}
}