package infoTechPackage.Day1.Day2;

import java.util.Scanner;

public class A3_IfQuestions {

    public static void main(String[] args) {
// Sondan 3.rakamı tek olan müsteri olup olmadığını belirleyin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen SSN`inizi giriniz:");
        int a = scan.nextInt();
        int aa = a % 1000 / 100;
        int aaa = aa%2;// even= çift rakam demektir odd=tek rakam demektir.
        System.out.println(aaa);

        if (aaa==1  && aa>=5 || aa<5) {
            System.out.println("Bugün organizyona katılabilirsiniz!");
        }
        else if (aaa==1 && aa<5) {
            System.out.println("Siz yarın gelebilirsiniz.");

        }

        else if (aaa !=1) {
            System.out.println("Bugün organizasyona katılma hakkınız yoktur");
        }
        else
            System.out.println("Sistemde kayıtlı olmayan müsteri");











    }

}
