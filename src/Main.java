import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 30 Aralik 2023 saat 22.00
Problem Tanımı :
Basit 4 işlem yapan bir hesap makinesi kodlayınız....
Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
Kullanicidan iki sayi girmesini isteyiniz.
Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.

*/

        while(true)
        {
        Scanner scan=new Scanner(System.in);
            System.out.println();
        System.out.println("################  HESAP MAKİNESİ ################");
        System.out.print("Lütfen İlk Sayınızı Giriniz:");
        int sayi1 = scan.nextInt();
        System.out.print("Lütfen Yapmak İstediğiniz işlemin işaretini giriniz (+,-,*,/) :");
        char islem = scan.next().charAt(0);
        System.out.print("Lütfen ikinci Sayınızı Giriniz:");
        int sayi2 = scan.nextInt();

        switch (islem)
        {
            case '+':
                System.out.println(sayi1+sayi2);
                System.out.println("###############################################");break;
            case '-':
                System.out.println(sayi1-sayi2);
            System.out.println("###############################################");break;
            case '*':
                System.out.println(sayi1*sayi2);
                System.out.println("###############################################");break;
            case '/':
                System.out.println(sayi1/sayi2);
                System.out.println("###############################################");break;
            default:
                System.out.println("Yanlış İşlem Lütfen Tekrar Deneyiniz"); break;
        }
    }

    }
}