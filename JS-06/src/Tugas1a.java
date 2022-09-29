/**
 * Created by 21343045_Farraz Hadyan
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1a {
    public static void main(String[] args) {
    BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
    String a,b,c;
    float nomerSatu,nomerDua,nomerTiga;
    double average;

    try{
        System.out.print("Masukkan nilai BIOLOGI = ");
        a = masuk.readLine();
        nomerSatu = Float.parseFloat(a);

        System.out.print("Masukkan nilai FISIKA  = ");
        b = masuk.readLine();
        nomerDua = Float.parseFloat(b);

        System.out.print("Masukkan nilai KIMIA   = ");
        c = masuk.readLine();
        nomerTiga = Float.parseFloat(c);

        average = ((nomerSatu+nomerDua+nomerTiga)/3);

        System.out.println("Nilai BIOLOGI : "+nomerSatu);
        System.out.println("Nilai FISIKA  : "+nomerDua);
        System.out.println("Nilai KIMIA   : "+nomerTiga);
        System.out.println("Rata-Rata Nilai = " +average);

        if (average >=60){
            System.out.println("Selamat kamu berhasil :-)");
            }
        else {  
            System.out.println("Maaf kamu gagal :-(");
            }
        }
     catch(IOException e){
        System.out.println("Gagal Membaca Keyboard");
        }
    }
}