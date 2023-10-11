import java.util.Scanner;
public class DoWhileCuti05 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti : ");
        jatahCuti = sc.nextInt();
        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)?  ");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari : ");
                jumlahHari = sc.nextInt();
                while (jumlahHari > jatahCuti) {
                    System.out.println("Jumlah hari yang anda masukkan melebihi jatah cuti yang tersedia. Silakan masukkan kembali jumlah hari yang sesuai.");
                    jumlahHari = sc.nextInt();
                }
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti : " + jatahCuti);
            }
        } while(jatahCuti > 0);
    }
}