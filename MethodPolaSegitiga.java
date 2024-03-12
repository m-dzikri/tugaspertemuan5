package methodpolasegitiga;

import java.util.Scanner;

public class MethodPolaSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N (1 s.d. 1000): ");
        int N = scanner.nextInt();

        // Memastikan nilai N berada dalam rentang yang valid
        if (N >= 1 && N <= 1000) {
            // Memanggil metode cetakPola dengan nilai N yang dimasukkan
            cetakPola(N);
        } else {
            System.out.println("Nilai N harus berada dalam rentang 1 s.d. 1000");
        }
    }

    // Metode untuk mencetak pola berdasarkan nilai N
    public static void cetakPola(int N) {
        // Loop untuk mengatur baris
        for (int i = 1; i <= N; i++) {
            // Loop untuk mencetak '*' sesuai dengan jumlah kolom yang diperlukan
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Pindah ke baris baru setelah mencetak satu baris pola
            System.out.println();
        }
    }
}

