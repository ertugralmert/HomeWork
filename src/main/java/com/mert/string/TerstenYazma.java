package com.mert.string;

import java.util.Scanner;

public class TerstenYazma {
    /*
   Dışarıdan bir metin girelim daha sonra bu metning tersini bir değişkene atauıp yazdıralım.
    */
    public static void main(String[] args) {
        System.out.println("Program Started");

        Scanner scanner = new Scanner(System.in);
        StringBuffer newMetin = new StringBuffer();


        System.out.println("Lütfen bir metin giriniz:");
        String metin = scanner.nextLine();
        for ( int i = metin.length()-1; i>-1; i--){

            char terstenAl = metin.charAt(i);
            newMetin.append(terstenAl);

        }
        System.out.println(newMetin);





    }
}

