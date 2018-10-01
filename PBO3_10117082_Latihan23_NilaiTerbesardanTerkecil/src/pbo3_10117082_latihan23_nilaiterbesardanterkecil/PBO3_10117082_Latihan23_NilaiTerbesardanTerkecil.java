/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan23_nilaiterbesardanterkecil;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan nilai 
* terbesar dan terkecil dan inputannya berasal dari user
 */
public class PBO3_10117082_Latihan23_NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nMahasiswa;
        int nilaiMahasiswa[] = new int[100];
        double nilaiBesar = 0;
        double nilaiKecil = 100;
        String namaPetugas;
        
        
        
        System.out.println("=======Program Nilai Terbesar Dan Terkecil======");
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan Nama Petugas : ");
        namaPetugas = scn.next();
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        nMahasiswa = scn.nextInt();
     
        for (int i = 1; i <= nMahasiswa; i++){
        System.out.println("Nilai Mahasiswa Ke-"+i+" : ");
        nilaiMahasiswa[i] = scn.nextInt();
        
        }
       System.out.println("=======Hasil Nilai Mahasiswa======");
       for (int i = 1; i <=nMahasiswa; i++){
       System.out.println("Nilai Mahasiswa Ke-"+i+" : "+nilaiMahasiswa[i]);
       
       
       }
       for (int i = 1; i <= nMahasiswa; i++){
       if(nilaiMahasiswa[i]>nilaiBesar){
        nilaiBesar = nilaiMahasiswa[i];
       }
       else
       if(nilaiMahasiswa[i]<nilaiKecil){
           nilaiKecil = nilaiMahasiswa[i];
           }
       
       }
    System.out.println("\nNilai Terbesar Adalah "+nilaiBesar);
       System.out.println("\nNilai Terkecil Adalah "+nilaiKecil);
      System.out.println("\nNama Petugas : "+namaPetugas);
    }
    
}
