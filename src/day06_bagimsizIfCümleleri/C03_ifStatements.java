package day06_bagimsizIfCümleleri;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin üc kenar uzunlugunu giriniz ");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        /*
          if(kenar1==kenar2==kenar3  ......yazamayız
          Java'da 3'lu karsilastirma YOKTUR
          Onun yerine ikili karsilastirmalar yapip && ile birlestirebiliriz
         */

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Girilen kenarlar bir eskenar ücgen olusturur");
        }


    }
}
