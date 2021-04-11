package infoTechPackage.Day2;

import java.util.Scanner;

public class A2_IfQuestions {
    public static void main(String[] args){
   // Sondan 3.rakamı tek olan müsteri olup olmadığını belirleyin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen SSN`inizi giriniz:");
        int a = scan.nextInt();
       /* int aa = a % 1000 / 100;
        int aaa = aa%2;// even= çift rakam demektir odd=tek rakam demektir.
        System.out.println(aaa);*/

        if (a%1000/100%2==1) {
            System.out.println("Bugün organizyona katılabilirsiniz!");
        }
        else if (a%1000/100%2!=1) {
            System.out.println("Bugün organizasyona katılma hakkınız yoktur");
        }
        /*if (aaa==1) {
            System.out.println("Bugün organizyona katılabilirsiniz!");
        }
        else if (aaa !=1) {
            System.out.println("Bugün organizasyona katılma hakkınız yoktur");
        }*/


        /*else if (aaa==0) {
            System.out.println("Bugün organizasyona katılma hakkınız yoktur!");
        }*/


    }





}
