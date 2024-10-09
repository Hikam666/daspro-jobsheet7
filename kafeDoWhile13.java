import java.util.Scanner;
public class kafeDoWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga; 
        String namaPelanggan;
        do { 
           System.out.println("Masukan nama pelanggan (ketik 'Batal' untuk keluar): ");
           namaPelanggan = sc.nextLine();
           if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
           } 
           System.out.println("Jumlah kopi: ");
           kopi = sc.nextInt();
           System.out.println("Masukan jumlah teh: ");
           teh = sc.nextInt();
           System.out.println("Jumlah roti: ");
           roti = sc.nextInt();

           totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
           System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
           sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");

    }
}
