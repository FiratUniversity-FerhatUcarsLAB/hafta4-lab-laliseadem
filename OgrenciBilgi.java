/*
 * Ad Soyad: [Lalise Adem Wado]
 * Ogrenci No: [240541610]
 * Tarih: [11\5\2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;
public class OgrenciBilgi {
    public static void main(String[]args){
        //Take the inputs from the user and store it in different variables.
        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi girin: ");
        String ad = input.nextLine();
        System.out.print("Soydinizi girin: ");
        String soyad = input.nextLine();
        System.out.print("ogrenco numarinizi giriniz: ");
        int ogrenciNo = input.nextInt();
        System.out.print("Yasnizi giriniz: ");
        int yas = input.nextInt();
        System.out.print("GPA(0.00-4.00): ");
        float gpa = input.nextFloat();
        //print the information taken from the user in a formatted way.
        System.out.println("===OGRENCI BILGI SISTEMI===");
        System.out.printf("Ad Soyad: %s %s",ad,soyad);
        System.out.printf("\nYas: %d " ,yas);
        System.out.printf("\nGPA: %.2f ", gpa);
        //close the scanner
        input.close();
    }
}
