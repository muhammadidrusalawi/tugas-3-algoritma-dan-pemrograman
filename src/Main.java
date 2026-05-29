import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indonesia);
        rupiah.setMaximumFractionDigits(0);

        double[] gaji = {5000000,6500000,9500000};

        double[] lembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        char golongan;
        int jamLembur;

        double gajiPokok = 0;
        double persenLembur = 0;
        double gajiLembur;
        double totalGaji;

        System.out.print("Masukkan golongan (A/B/C): ");
        golongan = input.next().toUpperCase().charAt(0);

        System.out.println("Masukkan jumlah jam lembur: ");
        jamLembur = input.nextInt();

        if (golongan == 'A' ) {
            gajiPokok = gaji[0];
        } else if (golongan == 'B') {
            gajiPokok = gaji[1];
        } else if (golongan == 'C') {
            gajiPokok = gaji[2];
        } else {
            System.out.println("Golongan tidak valid");
            return;
        }

        if (jamLembur == 1 ){
            persenLembur = lembur[0];
        } else if (jamLembur == 2) {
            persenLembur = lembur[1];
        } else  if (jamLembur == 3) {
            persenLembur = lembur[2];
        } else   if (jamLembur == 4) {
            persenLembur = lembur[3];
        } else   if (jamLembur == 5) {
            persenLembur = lembur[4];
        } else {
            persenLembur = 0;
        }

        gajiLembur = gajiPokok * persenLembur;
        totalGaji = gajiPokok + gajiLembur;


        System.out.println("\n============== RINCIAN GAJI =============");
        System.out.println("Golongan				: " + golongan);
        System.out.println("Gaji Pokok				: " + rupiah.format(gajiPokok));
        System.out.println("Gaji Lembur				: " + rupiah.format(gajiLembur));
        System.out.println("Total Gaji				: " + rupiah.format(totalGaji));
        System.out.println("========================================");

    }
}