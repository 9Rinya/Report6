/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e205709;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class FileMaster{
  void function_select(String args[]){

    //ユーザー入力による機能選択
    Scanner scanner = new Scanner(System.in);
    System.out.println("使用したい機能を選択してください===========================");
    System.out.println("1-キャラクター情報の検索");
    String input_number = scanner.nextLine();
    System.out.println(input_number+"が選択されました");
    scanner.close();
    
    Infomation info = new Infomation();

    switch (1){
      case 1:
      info.reference_Infomation(args);
    }
  }
  
}

