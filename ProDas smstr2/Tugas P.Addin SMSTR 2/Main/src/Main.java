import core.module.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    final static int VID = 171116002;

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Tugas Terstruktur - ADITYA PURWA 171116002");
                System.out.println("Ketik `exit` untuk keluar");
                System.out.println("Pilih Menu Dengan Mengetikkan Angka Menu:");
                System.out.println("1. Menghitung Hypotenusa Segitiga Siku-siku");
                System.out.println("2. Menghitung Perkalian Dot Matrix 2x2");
                System.out.println("3. Menghitung huruf vocal dan consonant");
                System.out.println("4. Menghitung massa jenis air");
                System.out.println("5. Konversi angka bulat ke angka romawi");
                System.out.println("");
                System.out.print("Pilihan Menu: ");
                String input = reader.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                int menu = Integer.parseInt(input);
                BaseModule module = null;
                switch (menu) {
                    case 1:
                        module = new TriangleModule(System.in, System.out);
                        break;
                    case 2:
                        module = new MatrixModule(System.in, System.out);
                        break;
                    case 3:
                        module = new VoconsModule(System.in, System.out);
                        break;
                    case 4:
                        module = new DensityModule(System.in, System.out);
                        break;
                    case 5:
                        module = new RomanModule(System.in, System.out);
                        break;
                }
                if (module != null) {
                    System.out.println();
                    System.out.println("JALAN: " + module.getModuleName());
                    module.run();
                } else {
                    System.out.println();
                    System.out.println("Tidak ada menu " + menu);
                }
                System.out.println();
                System.out.println("------------------------------------------");
            } catch (Exception | StackOverflowError e) {
                e.printStackTrace();
            }
        }

    }
}
