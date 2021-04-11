package infoTechPackage.Day1.Day2;

import java.util.Scanner;

public class A7_Char {

    public static void main(String[] args){
        //"Hava soguk" yazınız.
        //Cümle içerisindeki a harfi sayısını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String s= scan.nextLine();
        int l=s.length();
        System.out.println(l);

        int sayac=0;

        for (int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));

            if (s.charAt(i)== 'a') {
                sayac++;
            }
        }
        System.out.println("Girmiş olduğunuz cümlede "+ sayac +" tane a harfi bulunmaktadır.");


        }
}
