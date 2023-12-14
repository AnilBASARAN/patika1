import java.util.Scanner;

public class BiletFiyat {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Kullanıcıdan bilgileri al
            System.out.print("Mesafe (KM): ");
            int mesafe = input.nextInt();

            System.out.print("Yaşınız: ");
            int yas = input.nextInt();

            System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
           int yolculukTipi = input.nextInt();

            // Girdi doğrulama
            if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
                System.out.println("Hatalı Veri Girdiniz!");
                return;
            }

            // Uçuş fiyatını hesapla
            double birimFiyat = 0.10;
            double toplamFiyat = mesafe * birimFiyat;

            // İndirimleri uygula
            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                toplamFiyat *= 0.7; // %30 indirim
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 1.6; // %20 indirim
            }

            // Sonucu ekrana yazdır
            System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");

            // Scanner'ı kapat
        input.close();
        }
    }


