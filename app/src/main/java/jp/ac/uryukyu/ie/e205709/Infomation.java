package jp.ac.uryukyu.ie.e205709;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
class Infomation {
    
    void reference_Infomation(String[] args){
    int toriger = 0;
    File f = new File("/Users/hirayamaosamunari/prog2/report6/Character_info.txt");
    try(Scanner sc = new Scanner(f)){
        sc.useDelimiter(",");
        System.out.println("検索したいサーヴァントの名前を入力してください");
        Scanner scanner = new Scanner(System.in);
        String input =scanner.next();
        while(sc.hasNext()){
            String name = sc.next();
            String treasure = sc.next();
            String skill_1 = sc.next();
            String skill_2 = sc.next();
            String skill_3 = sc.next();
            String comand = sc.next();
           
            for (int i=0; i<1; i++){
                System.out.println();
            }
            if(Arrays.asList(name).contains(input)){
            System.out.println("====================================");  
            System.out.println("真名--"+name);
            System.out.println("宝具--"+treasure);
            System.out.println("スキル1--"+skill_1);
            System.out.println("スキル2--"+skill_2);
            System.out.println("スキル3--"+skill_3);
            System.out.println("コマンドカード--"+comand);
            System.out.println("===================================="); 
            toriger+=1;
            for (int i=0; i<2; i++){
                System.out.println();
            }
        }else if(sc.hasNext()==true){ sc.nextLine();} //次の行があるなら次へ
        else if(sc.hasNext()==false && toriger ==0){System.out.println(input+"はこのファイルに存在しないよ");}
        }
        sc.close();//fileを閉じる
    }catch(FileNotFoundException e){ //例外処理
        System.out.println(e);
    }catch(IOException e){
        System.out.println(e);
    }
    } 
} 
    
        


    

