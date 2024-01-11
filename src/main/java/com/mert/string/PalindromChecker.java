package com.mert.string;

import java.util.Scanner;

public class PalindromChecker {
      /*
    Dışarıdan girilen kelimenin Palindrom olup olmadığını kontrol edelim
     */

    public static void main(String[] args) {
        System.out.println("Program Started");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin Griniz:");
        String metin = scanner.nextLine();
        StringBuffer newMetin = new StringBuffer();


        for (int i = metin.length()-1; i>-1; i--){
            newMetin.append(metin.charAt(i));
        }

        System.out.println(newMetin);
        if (newMetin.toString().equals(metin)){
            System.out.println("Bu bir Palindrom'dur.");
        }
        else {
            System.out.println("Palindrom Değildir.");
        }
        System.out.println("Program Finished");
    } // main method sonu
} // class sonu

/**
 * Burada şunu öğrendim. StringBuffer ile oluşturulan bir ifade String'e hiç bir zaman eşit olmaz.
 * O yüzden to.String() yapmak lazım.
 */

