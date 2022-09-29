/**
 * Created by 21343045_Farraz Hadyan
 */
import java.util.Scanner;

public class Tugas2a {
    public static void main(String[] args) {
        Scanner dataIn = new Scanner (System.in);

        int input;

        System.out.print("Masukkan Angka = ");
        input = dataIn.nextInt();

        if(input == 1){
            System.out.print("Angka Satu !!!");
        }
        else if(input == 2){
            System.out.print("Angka Dua !!!");
        }
        else if(input == 3){
            System.out.print("Angka Tiga !!!");
        }
        else if(input == 4){
            System.out.print("Angka Empat !!!");
        }
        else if(input == 5){
            System.out.print("Angka Lima !!!");
        }
        else if(input == 6){
            System.out.print("Angka Enam !!!");
        }
        else if(input == 7){
            System.out.print("Angka Tujuh !!!");
        }
        else if(input == 8){
            System.out.print("Angka Delapan !!!");
        }
        else if(input == 9){
            System.out.print("Angka Sembilan !!!");
        }
        else if(input == 10){
            System.out.print("Sepuluh !!!");
        }
        else{
            System.out.println("angka invalid");    
        }
    }
}