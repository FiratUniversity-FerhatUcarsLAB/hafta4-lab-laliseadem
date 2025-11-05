Ad Soyad: [Lalise Adem Wado]
Ogrenci No: [240541610]
Tarih: [11/5/2025]
Aciklama: [Maas Hesaplama]

  
import java.util.Scanner;
public class MaasHesap {
    public static void main(String[]args){
        //Take the information from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi giriniz: ");
        String ad = input.nextLine();
        System.out.print("Soyadinizi Giriniz: ");
        String soyad = input.nextLine();
        System.out.print("Aylic brut maasinizi girinizT(TL): ");
        double aylikBrutMaasi = input.nextDouble();
        System.out.print("Haftalik Calisma Saatinizi Giriniz: ");
        int haftalikCalismaSaati = input.nextInt();
        System.out.print("Mesai Calisma Saatinizi Giriniz: ");
        int mesaiCalismaSaati = input.nextInt();
        //Store constants
        final double sgkOrani = 0.14;
        final double gelirVergisiOrani = 0.15;
        final double damgaVergisiOrani = 0.00759;
        //calculate the payroll.
        double mesaiUcreti= (aylikBrutMaasi/160.0) * mesaiCalismaSaati * 1.5;
        double toplamGelir = aylikBrutMaasi + mesaiUcreti;
        double sgk = toplamGelir * sgkOrani;
        double gelirVergisi = toplamGelir * gelirVergisiOrani;
        double damgaVergisi = toplamGelir * damgaVergisiOrani;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;
        double netMaas = toplamGelir - toplamKesinti;
        double kesintiOrani = (toplamKesinti/ toplamGelir) * 100.0;
        double saatliknetKazanc = netMaas /176;
        double gunlukNetKazanc = netMaas / 22;
        //Print the output of the calculation in formatted way.
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("          MAAS BRODROSU");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Calisan: " + ad + " " + soyad);
        System.out.println("GELIRLER");
        System.out.printf("Burut Maas:   %.2f TL " , aylikBrutMaasi);
        System.out.printf("\nMesai Ucreti: %.2f TL" , mesaiUcreti);
        System.out.print("\n-----------------------------------");
        System.out.printf("\nToplam Gelir: %.2f TL" ,toplamGelir);
        System.out.print("\nKESINTILER");
        System.out.printf("\nSGK kesintisi (14.0%%): %.2f TL" , sgk);
        System.out.printf("\nGelir Vergisi (15.0%%): %.2f TL", gelirVergisi);
        System.out.printf("\nDamga Vergisi (0.8%%):  %.2f TL", damgaVergisi);
        System.out.print("\n-----------------------------------");
        System.out.printf("\nToplam Kesinti: %.2f TL", toplamKesinti);
        System.out.printf("\nNet Maas: %.2f TL",netMaas);
        System.out.print("\n-------------------------------------");
        System.out.printf("\nKesinti Orani: %.1f %%",kesintiOrani);
        System.out.printf("\nSaatlik Net kazanc: %.2f", saatliknetKazanc);
        System.out.printf("\nGunluk Net Kazanc: %.2f",gunlukNetKazanc);
        System.out.print("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}  

