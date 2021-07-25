package Daftar_Pengunjung_Perpustakaan;
import java.util.Scanner;
public class Main {

    static void Tampilkan() {
        String[] nama = new String[5];
        String[] nomor = new String[5];
        String[] gender = new String[5];
        // Isi Data Nama
        nama[0] = "Rizky Faisal Rafi";
        nama[1] = "Verry Sulistiawan";
        nama[2] = "Septi Wijayanti";
        nama[3] = "Tian Fatmanuraini";
        nama[4] = "Ulva Rahmawati";

        // Isi Data NIM
        nomor[0] = "2022436121";
        nomor[1] = "2023436122";
        nomor[2] = "2024436123";
        nomor[3] = "2025436124";
        nomor[4] = "2026436125";

        // Isi Data Gender
        gender[0] = "Pria";
        gender[1] = "Pria";
        gender[2] = "Wanita";
        gender[3] = "Wanita";
        gender[4] = "Wanita";

        // Menampilkan Data
        System.out.println("No.\t\tNama\t\t\tGender\t\t\tNIM");
        System.out.println("1. " + nama[0] + "\t" + gender[0] + "\t\t " + nomor[0]);
        System.out.println("2. " + nama[1] + "\t" + gender[1] + "\t\t " + nomor[1]);
        System.out.println("3. " + nama[2] + "\t\t" + gender[2] + "\t\t " + nomor[2]);
        System.out.println("4. " + nama[3] + "\t" + gender[3] + "\t\t " + nomor[3]);
        System.out.println("5. " + nama[4] + "\t\t" + gender[4] + "\t\t " + nomor[4]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int a;
        String note = ("\n# MASUKAN HANYA ANGKA SAJA");

        do {
            System.out.println("\n###### Perpustakaan GameLab Indonesia ######");
            System.out.println("1. Tampilkan Pengunjung");
            System.out.println("2. Keluar");
            System.out.println("############################################");
            System.out.print("Pilih Menu : ");
            a = input.nextInt();

            if (a == 1) {
                Tampilkan();
                System.out.println("\t\t\t1.Ya\t(Kembali)\t\t\t");
                System.out.println("\t\t\t2.tidak\t(Keluar)\t\t\t");
                System.out.println("\t\t\t# Masukan Hanya Angka\t\t\t");
                try {
                    System.out.print("\t\t\tKembali(1/2) ? ");
                    pilihan =input.nextInt();
                    if (pilihan == 2) {
                        System.out.println("\nProgram Keluar");
                        System.out.println("Terima Kasih :)");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(note.toUpperCase());
                    System.out.println("# Kembali Ke Menu Utama");
                    input.next();
                }

            }

            else if (a == 2) {
                System.out.println("\nProgram Finish");
                System.out.println("Terima Kasih :)");
                break;
            }

        } while (true);
    }
}
