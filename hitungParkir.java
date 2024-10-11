import java.util.Scanner;

public class hitungParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPembayaran = 0;
        int jenisKendaraan;
        int durasiParkir;
        int biayaParkir;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Selesai): ");
            jenisKendaraan = input.nextInt();
            
            if (jenisKendaraan == 0) {
                break;
            }
            
            System.out.print("Masukkan durasi parkir (jam): ");
            durasiParkir = input.nextInt();
            
            
            if (durasiParkir > 5) {
                biayaParkir = 12500;
            } else {
                if (jenisKendaraan == 1) { 
                    biayaParkir = 3000 * durasiParkir;
                } else {
                    biayaParkir = 2000 * durasiParkir;
                }
            }
            
            totalPembayaran += biayaParkir;
            System.out.println("Biaya parkir: Rp " + biayaParkir);
        } while (true);
        
        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
        input.close();
    }
}