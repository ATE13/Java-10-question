import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sayiTahminOyunu();
    }
    public static void ebobEkokHesap() {
        Scanner girdi1 = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz.");
        int sayi1 = girdi1.nextInt();
        Scanner girdi2 = new Scanner(System.in);
        System.out.println("2. Sayıyı giriniz.");
        int sayi2 = girdi2.nextInt();
        int ebob = 0;
        int ekok = 0;

        for (int i = 1; i <= sayi1 || i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0)
                ebob = i;
        }
        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("Ebob :" + ebob);
        System.out.println("Ekok :" + ekok);
    }

    public static void mukemmelSayi() {
        //kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");
        int sayi = okuyucu.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel bir sayı değildir.");
        }
    }

    public static void arkadasSayi() {
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz.");
        int sayi1 = okuyucu.nextInt();
        Scanner okuyucu2 = new Scanner(System.in);
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        int sayi2 = okuyucu2.nextInt();
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayıdır.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayı değildir.");
        }
    }

    public static void asalSayi() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Lütfen 0'dan büyük bir tam sayı giriniz.");
        int sayi = reader.nextInt();
        boolean isPrime = true;

        if (sayi == 1) {
            System.out.println(sayi + " Asal bir sayı değildir.");
            return;
        }
        if (sayi <= 0) {
            System.out.println("Geçersiz Sayı girdiniz.");
            return;
        }

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(sayi + " Asal bir sayıdır.");
        } else {
            System.out.println(sayi + " Asal sayı değildir.");
        }
    }

    public static void buyukSayiyiBulma() {
        Scanner girdi1 = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int sayi1 = girdi1.nextInt();
        Scanner girdi2 = new Scanner(System.in);
        System.out.println("ikinci sayıyı giriniz");
        int sayi2 = girdi2.nextInt();
        Scanner girdi3 = new Scanner(System.in);
        System.out.println("Üçüncü sayıyı giriniz");
        int sayi3 = girdi3.nextInt();

        int enBuyuk = sayi1;
        if (sayi1 < sayi2) {
            enBuyuk = sayi2;
        }
        if (sayi2 < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı :" + enBuyuk);
    }

    public static void daireAlanAndCevre() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Yarı çap'ı giriniz");
        double r = girdi.nextDouble();

        double pi = 3.14159265359;
        double alanHesap = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println(alanHesap);
        System.out.println(cevre);
    }

    public static void haftaIcıHesaplama() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Haftanın kaçıncı gündesiniz (lütfen 1-7 arası olarak giriş yapın.):");
        int gunSayisi = girdi.nextInt();

        if (0 < gunSayisi && gunSayisi < 8) {

            switch (gunSayisi) {
                case 6:
                case 7:
                    System.out.println("Bugün hafta sonu.");
                    break;
                default:
                    System.out.println("Bugün hafta içi.");
            }
        } else {
            System.out.println("Geçersiz sayı girdiniz.");
        }
    }

    public static void faktorielHesaplama() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz");
        int sayi = girdi.nextInt();

        int carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim = carpim * i;
        }
        System.out.println(carpim);
    }

    public static void ciftTekHesaplama() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Tek & Çift kontrolü yapacağınız sayıyı giriniz.");
        int sayi = girdi.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " Çift bir sayıdır.");
        } else {
            System.out.println(sayi + " Tek bir sayıdır");
        }
    }

    public static void sayiTahminOyunu() {
        Scanner girdi = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Lütfen 1-100 arasında bir sayı giriniz:");
        int tahmin = girdi.nextInt();
        int sayi = random.nextInt(101);
        while (tahmin != sayi) {
            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Lütfen 1-100 arasında bir sayı giriniz:");
                tahmin = girdi.nextInt();
            } else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz:");
                tahmin = girdi.nextInt();
            } else {
                System.out.println("Daha küçük bir sayı giriniz:");
                tahmin = girdi.nextInt();
            }
        }
        System.out.println("Tebrikler, doğru bildiniz.");
    }
}


