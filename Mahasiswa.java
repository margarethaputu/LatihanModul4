import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama , kelas, matkulPraktikum;
    int NIM ;

    public Mahasiswa (String nm , String kl, String mat , int ni){
        nama = nm ;
        kelas = kl ;
        matkulPraktikum = mat ;
        NIM = ni ;

    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        HashMap< String,Mahasiswa > mhs = new HashMap<>();
        String input ;
        Mahasiswa data ;

        mhs.put("1" , new Mahasiswa("Reta", "3H","StrukturData","202110370311149"));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas
                    + "Mata Kuliah Praktikum : " + data.matkulPraktikum + "NIM : " + data.NIM);
        }
    }
}