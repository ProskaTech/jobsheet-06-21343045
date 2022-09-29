/**
 * Created by 21343045_Farraz Hadyan
 */
import java.util.Scanner;

public class Tugas2b {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);

        int input;

        System.out.print("Masukkan Angka = ");
        input = masuk.nextInt();

        switch(input){
            case 1:
                System.out.println("Angka Satu !!!");
                break;
            case 2:
                System.out.println("Angka Dua !!!");
                break;
            case 3:
                System.out.println("Angka Tiga !!!");
                break;
            case 4:
                System.out.println("Angka Empat !!!");
                break;
            case 5:
                System.out.println("Angka Lima !!!");
                break;
            case 6:
                System.out.println("Angka Enam !!!");
                break;
            case 7:
                System.out.println("Angka Tujuh !!!");
                break;
            case 8:
                System.out.println("Angka Delapan !!!");
                break;
            case 9:
                System.out.println("Angka Sembilan !!!");
                break;
            case 10:
                System.out.println("Sepuluh !!!");
                break;
            default:
                System.out.println("nomer invalid ");
        }
    }
}