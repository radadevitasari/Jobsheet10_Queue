import java.util.Scanner;
public class KRSMain19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS19 antrian = new AntrianKRS19(10);

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Sudah Proses");
            System.out.println("8. Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    antrian.enqueue(new Mahasiswa19(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.dequeue2Mahasiswa();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkan2Terdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Sudah proses: " + antrian.getSudahProses());
                    break;

                case 8:
                    System.out.println("Belum proses: " + antrian.getBelumProses());
                    break;
                case 9:
                    antrian.clear();
                    break;
            }

        } while (pilih != 0);
    }
}
    
