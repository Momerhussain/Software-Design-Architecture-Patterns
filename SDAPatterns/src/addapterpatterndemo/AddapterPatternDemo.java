/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addapterpatterndemo;
public class AddapterPatternDemo {
     public static void main(String[] args) {
             TextFile textfile = new TextFile();

      textfile.Text("txt", "Tenses.mp3");
      textfile.Text("jpg", "Book.jpg");
      textfile.Text("png", ".png");
   }
  }
