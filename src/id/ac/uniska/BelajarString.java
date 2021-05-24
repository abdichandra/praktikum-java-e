package id.ac.uniska;

import java.util.Locale;

public class BelajarString {
    public static void main(String[] args) {
        char [] uniskaChar = {'U','N','I','S','K','A'};
        String  uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);


        //##############################################################

        String namaDepan        = "Muhammad";
        String namaTengah       = "Abdi";
        String namaBelakang     = "Chandra";

        String namaLengkap = namaDepan +" "+ namaTengah+ " "+ namaBelakang;

        System.out.println(namaLengkap.length()); // mengetahui panjang karakter
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5, 12)); // menghilangkan karakter dari depan dan belakang sebanyak n
        System.out.println(namaLengkap.replace("Abdi", "Subahan")); // mereplace target dengan string yang di berikan
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String [] namaArray = namaLengkap.split(" ");
        System.out.println(namaArray.length);
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }
    }
}
