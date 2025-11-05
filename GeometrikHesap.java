* Ad Soyad: [Lalise Adem Wado]
* Ogrenci No: [240541610]
* Tarih: [11/5/2025]
* Aciklama: [GEOMETRIK HESAPLAMA]

import java.util.Scanner;

public class DaireHesap {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        //Take the value of the radius as an input from the user.
        System.out.println("*-------DAIRE GEOMETRIC HESAPLAYICI-------*");
        System.out.print("Daire yaricapini giriniz (cm): ");
        double yericapi = input.nextDouble();
        // calculate area, circumstance, diameter volume and surface area using the radius given through input.
        final float pi = 3.1415f;
        double alan = pi * Math.pow(yericapi,2);
        System.out.printf("Daire alani: %.2f cm^2" , alan);
        double cevre = 2 * pi * yericapi;
        System.out.printf("\nDaire Cevresi: %.2f cm" , cevre);
        double capi = 2 * yericapi;
        System.out.printf("\nDaire capi: %.2f cm" , capi);
        double hacim = 4.0/3.0 * pi * Math.pow(yericapi,3);
        System.out.printf("\nHacim: %.2f cm^3" , hacim);
        double KureYuzeyAlani = 4 * pi * Math.pow(yericapi,2);
        System.out.printf("\nKure Yuzey Alani: %.2f cm^2 " , KureYuzeyAlani);
        input.close();
    }

}
