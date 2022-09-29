/**
 * Created by 21343045_Farraz Hadyan
 */
import javax.swing.JOptionPane;

public class Tugas1b {
    public static void main(String[] args) {
        
        int nilaiSatu, nilaiDua, nilaiTiga;
        double avg;
        String hasil;
        
        nilaiSatu = Integer.valueOf(JOptionPane.showInputDialog("Input Nilai Biologi   : "));
        nilaiDua = Integer.valueOf(JOptionPane.showInputDialog("Input Nilai Kimia     : "));
        nilaiTiga = Integer.valueOf(JOptionPane.showInputDialog("Input nilai Fisika    : "));
        
        avg = ((nilaiSatu+nilaiDua+nilaiTiga)/3);

        if(avg >= 60){
            hasil = "Selamat Kamu Berhasil ! :-)";
        }
        else{
            hasil = "Maaf Kamu Belum Berhasil ! :-(";
        }

        JOptionPane.showMessageDialog(null, "Nilai Rata - Rata Anda : " + avg);
        JOptionPane.showMessageDialog(null, hasil);
    }   
}
