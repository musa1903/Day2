package infoTechPackage.Day1.Day2;

import java.util.Scanner;

public class A6_Char {
    public static void main(String[] args){
     //Bir kelime giriniz ilk harfi 'A' olsun.
     //Araba
     //01234

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
       //       String s= scan.nextLine();
       // System.out.println(s.length());
        char c = scan.next().charAt(0);
        System.out.println(c);

        if (c=='A'){
            System.out.println("İstenen özellikte kelime girilmiştir.");
        }
         else System.out.println("İstenen özellikte kelime girilmemiştir.");



    }
}