// 12S24046 - Indah Elsadai Nainggolan
// 12S24053 - Dea Anggreany Hutapea

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] isbn = new String[3];
        int[] bykbuku = new int[3];

        bykbuku[0] = 0;
        bykbuku[1] = 0;
        bykbuku[2] = 0;
        double[] price = new double[3];

        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        double[] sUM = new double[3];

        sUM[0] = 0;
        sUM[1] = 0;
        sUM[2] = 0;
        double totalakhir1;
        int i;
        int bykbuku0;
        int bykbuku1;
        int bykbuku2;

        i = 0;
        bykbuku0 = 0;
        bykbuku1 = 0;
        bykbuku2 = 0;
        String buku0;
        String buku1;
        String buku2;

        buku0 = "Buku";
        buku1 = "Buku";
        buku2 = "Buku";
        int nol;
        int satu;
        int dua;

        nol = 0;
        satu = 1;
        dua = 2;
        do {
            isbn[i] = input.nextLine();
            if (isbn[i].equals("---")) {
                i = 3;
            } else {
                if (isbn[i].equals(isbn[0])) {
                    if (nol == 0) {
                        buku0 = isbn[i];
                    }
                    if (isbn[0].equals(buku0)) {
                        i = 0;
                        price[i] = Double.parseDouble(input.nextLine());
                        bykbuku[i] = Integer.parseInt(input.nextLine());
                        bykbuku0 = bykbuku0 + bykbuku[i];
                        nol = 3;
                        i = i + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = isbn[i];
                        }
                        if (isbn[0].equals(buku1)) {
                            i = 1;
                            price[i] = Double.parseDouble(input.nextLine());
                            bykbuku[i] = Integer.parseInt(input.nextLine());
                            bykbuku1 = bykbuku1 + bykbuku[i];
                            nol = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            price[i] = Double.parseDouble(input.nextLine());
                            bykbuku[i] = Integer.parseInt(input.nextLine());
                            bykbuku2 = bykbuku2 + bykbuku[i];
                            nol = 3;
                            i = 0;
                        }
                    }
                } else {
                    if (isbn[i].equals(isbn[1])) {
                        if (satu == 1) {
                            buku1 = isbn[i];
                        }
                        if (isbn[1].equals(buku1)) {
                            i = 1;
                            price[i] = Double.parseDouble(input.nextLine());
                            bykbuku[i] = Integer.parseInt(input.nextLine());
                            bykbuku1 = bykbuku1 + bykbuku[i];
                            satu = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            price[i] = Double.parseDouble(input.nextLine());
                            bykbuku[i] = Integer.parseInt(input.nextLine());
                            bykbuku2 = bykbuku2 + bykbuku[i];
                            satu = 3;
                            i = 0;
                        }
                    } else {
                        if (isbn[i].equals(isbn[2])) {
                            if (dua == 2) {
                                buku2 = isbn[i];
                            }
                            if (isbn[2].equals(buku2)) {
                                i = 2;
                                price[i] = Double.parseDouble(input.nextLine());
                                bykbuku[i] = Integer.parseInt(input.nextLine());
                                bykbuku2 = bykbuku2 + bykbuku[i];
                                dua = 3;
                                i = 0;
                            }
                        }
                    }
                }
            }
        } while (i < 3);
        if (bykbuku0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (bykbuku0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (bykbuku0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
        }
        sUM[0] = price[0] * bykbuku0;
        if (bykbuku1 >= 20) {
            price[1] = price[1] - price[1] * 12 / 100;
        } else {
            if (bykbuku1 >= 10) {
                price[1] = price[1] - price[1] * 5 / 100;
            } else {
                if (bykbuku1 >= 5) {
                    price[1] = price[1] - price[1] * 2 / 100;
                }
            }
        }
        sUM[1] = price[1] * bykbuku1;
        if (bykbuku2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (bykbuku2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (bykbuku2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        sUM[2] = price[2] * bykbuku2;
        totalakhir1 = sUM[0] + sUM[1] + sUM[2];
        System.out.println(toFixed(totalakhir1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
