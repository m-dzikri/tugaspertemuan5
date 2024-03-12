package methodribuan;

import java.util.Scanner;

public class MethodRibuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan ke-1: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan ke-2: ");
        int bilangan2 = scanner.nextInt();

        System.out.print("Masukkan bilangan ke-3: ");
        int bilangan3 = scanner.nextInt();

        if (areAllRibuan(bilangan1, bilangan2, bilangan3)) {
            System.out.println("Ketiga bilangan adalah ribuan");
        } else if (isAnyRibuan(bilangan1, bilangan2, bilangan3)) {
            if (isRibuan(bilangan1) && isRibuan(bilangan2) && !isRibuan(bilangan3)) {
                System.out.println("Hanya dua bilangan pertama yang merupakan ribuan");
            } else if (isRibuan(bilangan1) && !isRibuan(bilangan2) && isRibuan(bilangan3)) {
                System.out.println("Hanya bilangan pertama dan ketiga yang merupakan ribuan");
            } else if (!isRibuan(bilangan1) && isRibuan(bilangan2) && isRibuan(bilangan3)) {
                System.out.println("Hanya dua bilangan terakhir yang merupakan ribuan");
            } else {
                System.out.println("Hanya satu bilangan yang merupakan ribuan");
            }
        } else {
            System.out.println("Tidak ada bilangan yang merupakan ribuan");
        }
    }

    // Method untuk memeriksa apakah semua bilangan adalah ribuan
    public static boolean areAllRibuan(int bilangan1, int bilangan2, int bilangan3) {
        return isRibuan(bilangan1) && isRibuan(bilangan2) && isRibuan(bilangan3);
    }

    // Method untuk memeriksa apakah setidaknya satu bilangan adalah ribuan
    public static boolean isAnyRibuan(int bilangan1, int bilangan2, int bilangan3) {
        return isRibuan(bilangan1) || isRibuan(bilangan2) || isRibuan(bilangan3);
    }

    // Method untuk memeriksa apakah suatu bilangan adalah ribuan
    public static boolean isRibuan(int bilangan) {
        return bilangan >= 1000 && bilangan <= 9999;
    }
}