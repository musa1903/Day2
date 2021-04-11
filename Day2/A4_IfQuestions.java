package infoTechPackage.Day1.Day2;

import java.util.Scanner;

public class A4_IfQuestions {
    public static void main(String[] args){
// Kullanıcının girdiği sayı 1000 den büyük veya 3 digit mi kontrol edelim.

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a = scan.nextInt();
        int aa= a%1000/100;
        int aaa= aa%2;
        //System.out.println("aaa");

        if (a>=100 || a<=-100){
            System.out.println("Sayınız 3 basamaklıdır.");
        }
        else if (a/10!=0){
            System.out.println("Sayınız 2 basamaklıdır.");
        }
        else System.out.println("Sayınız tek basamaklıdır.");






    }


}
