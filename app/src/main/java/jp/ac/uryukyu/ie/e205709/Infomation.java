package jp.ac.uryukyu.ie.e205709;
// import java.io.BufferedReader;
import java.io.File;
// import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
// import java.io.Reader;
import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
class Infomation {
    void reference_Infomation(String[] args){
        
    File f = new File("/Users/hirayamaosamunari/prog2/report6/Character_info.txt");

    try(Scanner sc = new Scanner(f)){
        sc.useDelimiter(",");
        while(sc.hasNextLine()){
       
            String name = sc.next();
            String treasure = sc.next();
            String skill_1 = sc.next();
            String skill_2 = sc.next();
            String skill_3 = sc.next();
                
            System.out.println("真名--"+name);
            System.out.println("宝具--"+treasure);
            System.out.println("スキル1--"+skill_1);
            System.out.println("スキル2--"+skill_2);
            System.out.println("スキル3--"+skill_3);
            System.out.println();
            for (int i=0; i<1; i++){
                System.out.println();
            }
            sc.nextLine();//次の行へ  
        }
        sc.close();//fileを閉じる

    }catch(FileNotFoundException e){
        System.out.println(e);
    }catch(IOException e){
        System.out.println(e);
    }
    



    } 
} 
    
        


    

