/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
/**
 *
 * @author RIVALDI RAHMAT M
 * NAMA     : RIVALDI RAHMAT M
 * KELAS    : TI-B
 * NIM      : A2.1900155
 */
public class Main {


    public static void main (String[] args){


//        do {
//            aksi
//        } while (kondisi);


        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
