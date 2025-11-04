/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal6;

/**
 *
 * @author IDEAPAD
 */
import java.util.Scanner;
public class Soal6 {

    public static void main(String[] args) {
        System.out.println("Penjumlahan dua matriks");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Tentukan jumlah baris: ");
        int baris = masukan.nextInt();
        System.out.println("Tentukan jumlah kolom: ");
        int kolom = masukan.nextInt();
        
        int[][] matriksA = new int [baris][kolom];
        int[][] matriksB = new int [baris][kolom];
        int[][] Hasil = new int [baris][kolom];
        
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int x = 0; x < kolom; x++) {
                System.out.print("A[" + i + "][" + x + "] = ");
                matriksA[i][x] = masukan.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int x = 0; x < kolom; x++) {
                System.out.print("B[" + i + "][" + x + "] = ");
                matriksB[i][x] = masukan.nextInt();
            }
        }
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                Hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // 6. Tampilkan hasil
        System.out.println("\nHasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(Hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
