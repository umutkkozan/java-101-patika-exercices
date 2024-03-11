import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;

        //scanner sınıfı tanımla
      Scanner hesapla = new Scanner(System.in);
        System.out.println("Matematik Notunuz :");
        matematik = hesapla.nextInt();
        System.out.println("Girdiğiniz matematik notu : "+matematik);

        System.out.println("Fizik Notunuz :");
        fizik = hesapla.nextInt();
        System.out.println("Girdiğiniz matematik notu" +fizik);


        System.out.println("Kimya Notunuz :");
        kimya = hesapla.nextInt();
        System.out.println("Girdiğiniz matematik notu" +kimya);


        System.out.println("Turkce Notunuz :");
        turkce = hesapla.nextInt();
        System.out.println("Girdiğiniz matematik notu" +turkce);

        System.out.println("Tarih Notunuz :");
        tarih = hesapla.nextInt();
        System.out.println("Girdiğiniz matematik notu" +tarih);

        System.out.println("Muzik Notunuz :");
        muzik = hesapla.nextInt();
        System.out.println("Girdiğiniz matematik notu" +muzik);

        double sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Sonuç : " + sonuc);
    }

}
