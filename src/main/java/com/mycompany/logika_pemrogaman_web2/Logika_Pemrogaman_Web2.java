/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logika_pemrogaman_web2;

import java.util.Scanner;


public class Logika_Pemrogaman_Web2 {
    
    static String[] dataPasien = new String[10];
    
    public static String[] tambahDataPasien(String[] dataLama) {
        
        String[] dataBaru = new String[dataLama.length + 2];
        
        for (int i = 0; i < dataLama.length; i++) {
            dataBaru[i] = dataLama[i];
        }
        dataBaru[dataLama.length] = "Anggi";
        dataBaru[dataLama.length + 1] = "Adit";
        
        return dataBaru;
    }
    
    

    public static void main(String[] args) {
        Scanner myOBJ = new Scanner(System.in);
        System.out.println("Pasien1");
        String pasien1 = myOBJ.nextLine();
        
        System.out.println("Pasien2");
        String pasien2 = myOBJ.nextLine();
        
        System.out.println("Pasien3");
        String pasien3 = myOBJ.nextLine();

        dataPasien[0] = pasien1;
        dataPasien[1] = pasien2;
        dataPasien[2] = pasien3;
        dataPasien = tambahDataPasien(dataPasien);
        
        for (String string : dataPasien) {
            if (string != null) {
                System.out.println(string);    
            }
            
            
        }

    }
}
