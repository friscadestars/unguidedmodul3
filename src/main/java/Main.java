// Frisca Destar Suhertal
// 2211103065
// SI 06 B

import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        DataPegawai bca, bsi;
        bca = new DataPegawai();
        bsi = new DataPegawai();
        Scanner input = new Scanner(System.in);
        System.out.println("Input pegawai");
        System.out.print("Nama: ");
        bca.setNama(input.nextLine());
        System.out.print("NIP: ");
        bca.setNip(input.nextLine());
        System.out.print("Alamat: ");
        bca.setAlamat(input.nextLine());
        bca.setTotalGaji(7, 2500000);
        bca.cetakKeLayar();
        System.out.println();
        System.out.print("Nama: ");
        bsi.setNama(input.nextLine());
        System.out.print("NIP: ");
        bsi.setNip(input.nextLine());
        System.out.print("Alamat: ");
        bsi.setAlamat(input.nextLine());
        bsi.setTotalGaji(3000000);
        bsi.cetakKeLayar();
    }
}
