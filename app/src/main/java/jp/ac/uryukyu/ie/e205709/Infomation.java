package jp.ac.uryukyu.ie.e205709;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Infomation {
    void reference_Infomation(String[] args){
        
        try{
          File file = new File("/Users/hirayamaosamunari/prog2/report6/Character_info.txt");//ファイル指定
          FileReader filereader = new FileReader(file);
  
          int ch;
          while((ch = filereader.read()) != -1){
            System.out.print((char)ch);
          }
  
          filereader.close();//fileを閉じる
        }catch(FileNotFoundException e){
          System.out.println(e);
        }catch(IOException e){
         System.out.println(e);
       }
        
    }
}
    

