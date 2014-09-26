/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uas_sp_agaprasetya_2011141916;

/**
 *
 * @author aga
 */
public class jwbnmr2 {
     public static void main(String[] args) {
        char inisial = 'A';
        char nim = 'N';
        char alamat = 'R';
        char nomorhp = 'H';
        
        String nama = null;
        String nomor = null;
        String kota = null;
        String nohp = null;
        switch (inisial){
            case 'A': nama = "Aga Prasetya"; break;
            case 'E': nama = "Eko"; break;
            case 'F': nama = "Fikri"; break;
            case 'M': nama = "Syarif"; break;
            default: nama = "Data tidak ada";    
                

        }
        switch (nim){
            case 'N': nomor = "2011141916"; break;
            case 'E': nomor = "2011141917"; break;
            case 'O': nomor = "2011131212"; break;
            default: nomor = "Data tidak ada";    
                

        }
        switch (alamat){
            case 'R': kota = "Rangkasbitung"; break;
            case 'J': kota = "Jakarta"; break;
            case 'B': kota = "Bandung"; break;
            default: kota = "Data tidak ada";    
                

        }
        switch (nomorhp){
            case 'H': nohp = "087806734103"; break;
            case 'E': nohp= "0219747575"; break;
            case 'F': nohp = "08999212911"; break;
            default: nohp = "Data tidak ada";    
                

        }
        System.out.println("Nama = "+nama);
        System.out.println("Nim = "+nomor);
        System.out.println("Alamat = "+kota);
        System.out.println("Nomor HP = "+nohp);
    
}
}
