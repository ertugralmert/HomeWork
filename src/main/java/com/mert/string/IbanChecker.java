package com.mert.string;

import java.util.Scanner;

public class IbanChecker {
     /*
    Dışarıdan bir IBAN alınacak.
    TR ile başlarsa yurt içi işlemler yazsın ve eğer
    5001 Ziraat
    5002 Garanti
    5003 İş bankası
    OTH ise yurt dışı işlemler
    2000 ile bitiyorsa kıta için işlemler ve OTH yerine Ki ile başlasın
    eğer 2000 ile bitmiyorsa OTH yerine Kd 2002002002 yazdıralım
     */

    public static void main(String[] args) {
        int sayac = 0;

        do {
            System.out.println("Program Started");
            System.out.println("Lütfen IBAN numaranızı Giriniz");
            System.out.print("IBAN: ");


            String iban = new Scanner(System.in).nextLine();


            if (iban.toLowerCase().startsWith("tr")) {
                System.out.println("Yurt içi işlemler...");
                if (iban.endsWith("5001")) {
                    System.out.println("Ziraat Kartı");
                } else if (iban.endsWith("5002")) {
                    System.out.println("Garanti Bankası");
                } else if (iban.endsWith("5003")) {
                    System.out.println("İş Bankası");
                } else {
                    System.out.println("Başka KART");
                }
            } else if (iban.toLowerCase().startsWith("oth")) {
                System.out.println("Yurt dışı işlemler");
                if (iban.endsWith("2000")) {
                    System.out.println(iban.toLowerCase().replace("oth", "Ki "));
                } else {
                    System.out.println(iban.toLowerCase().replace("oth", "Kd "));
                }
            } else {
                System.out.println("Geçersiz IBAN girdiniz");
            }
            sayac++;
        }while (sayac < 3);
        System.out.println("Program Finished");




    } // main method sonu
} // class sonu

