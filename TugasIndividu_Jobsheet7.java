import java.util.Scanner;

public class TugasIndividu_Jobsheet7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sales, commission;
        String region;
        
        System.out.print("Masukkan total penjualan: $");
        sales = input.nextDouble();

        System.out.print("Masukkan wilayah penjualan (A/B): ");
        region = input.next().toUpperCase();

        commission = 0;

        if (region.equals("A")) {
            if (sales >= 14000) {
                commission = 0.075 * sales;
            } else if (sales >= 13000) {
                commission = 0.075 * sales;
            } else {
                commission = 0;
            }
        } else if (region.equals("B")) {
            if (sales >= 13000) {
                commission = 0.055 * sales;
            } else if (sales >= 7000) {
                commission = 0.055 * sales;
            } else {
                commission = 0;
            }
        } else {
            System.out.println("Wilayah tidak valid. Masukkan A atau B.");
            System.exit(0);
        }

        System.out.println("Komisi yang diterima: $" + commission);

        input.close();
    }
}
