package infoTechPackage.Day1.Day2;

import java.util.Scanner;

public class A5_IfQuestions {
    public static void main(String[] args) {
        // Girilen iki sayının artan sıra ile olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int a = scan.nextInt();
        System.out.println("birinci sayıyı girdiniz.");
        int b = scan.nextInt();
        System.out.println("ikinci sayıyı girdiniz.");

        if (a < b) {
            System.out.println("Sayılar artan sıra ile girilmistir");
        } else
            System.out.println("Sayılar azalan sıra ile girilmistir");

    }
}