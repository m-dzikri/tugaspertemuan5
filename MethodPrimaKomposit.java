package methodprimakomposit;

import java.util.Scanner;

public class MethodPrimaKomposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input batasAwal dan batasAkhir
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        // Memastikan batasAwal dan batasAkhir dalam rentang yang benar
        if (batasAwal < 1 || batasAkhir > 100 || batasAwal > batasAkhir) {
            System.out.println("Masukkan tidak valid. Pastikan batas awal >= 1 "
                    + "dan batas akhir <= 100.");
            return;
        }

        // Menampilkan hasil untuk bilangan prima
        System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        // Menampilkan hasil untuk bilangan komposit
        System.out.println();
        System.out.print("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method untuk menentukan apakah suatu bilangan prima atau komposit
    private static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


