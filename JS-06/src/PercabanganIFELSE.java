/**
 * Created by 21343045_Farraz Hadyan
 */

import java.util.Scanner;

public class PercabanganIFELSE {
    public static void main (String []args){
        double total_pembelian, diskon = 0;

        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukkan Total Pembelian: RP ");
        total_pembelian = dataMasuk.nextDouble();

        if (total_pembelian >=50000)
        diskon = 0.1 * total_pembelian;
        else 
        diskon = 0.02 * total_pembelian;

        System.out.println("Besarnya diskon : Rp " +diskon);
    }
}
