// 12S24046 - Indah Elsadai Nainggolan
// 12S24053 - Dea Anggreany Hutapea

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] isbn = new String[3];
        double[] price = new double[3];
        int[] quantity = new int[3];
        double[] totalprice = new double[3];
        double totalpriceall;

        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        totalprice[0] = 0;
        totalprice[1] = 0;
        totalprice[2] = 0;
        quantity[0] = 0;
        quantity[1] = 0;
        quantity[2] = 0;
        int n, totalbook0, totalbook1, totalbook2;

        totalbook0 = 0;
        totalbook1 = 0;
        totalbook2 = 0;
        n = 0;
        String no0, no1, no2;

        no0 = "good";
        no1 = "good";
        no2 = "good";
        int satu, dua, tiga;

        satu = 0;
        dua = 1;
        tiga = 2;
        while (n < 3) {
            isbn[n] = input.nextLine();
            if (isbn[n].equals("---")) {
                n = 3;
            } else {
                if (isbn[n].equals(isbn[0])) {
                    if (satu == 0) {
                        no0 = isbn[n];
                    }
                    if (isbn[0].equals(no0)) {
                        n = 0;
                        price[n] = Double.parseDouble(input.nextLine());
                        quantity[n] = Integer.parseInt(input.nextLine());
                        totalbook0 = totalbook0 + quantity[n];
                        satu = 3;
                        n = n + 1;
                    } else {
                        if (dua == 1) {
                            no1 = isbn[n];
                        }
                        if (isbn[0].equals(no1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            totalbook1 = totalbook1 + quantity[n];
                            satu = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            totalbook2 = totalbook2 + quantity[n];
                            satu = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (isbn[n].equals(isbn[1])) {
                        if (dua == 1) {
                            no1 = isbn[n];
                        }
                        if (isbn[1].equals(no1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            totalbook1 = totalbook1 + quantity[n];
                            satu = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            quantity[n] = Integer.parseInt(input.nextLine());
                            totalbook2 = totalbook2 + quantity[n];
                            satu = 3;
                            n = 0;
                        }
                    } else {
                        if (isbn[n].equals(isbn[2])) {
                            if (tiga == 2) {
                                no2 = isbn[n];
                            }
                            if (isbn[1].equals(no1)) {
                                n = 2;
                                price[n] = Double.parseDouble(input.nextLine());
                                quantity[n] = Integer.parseInt(input.nextLine());
                                totalbook2 = totalbook2 + quantity[n];
                                satu = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        }
        if (totalbook0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (totalbook0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (totalbook0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
        }
        totalprice[0] = price[0] * totalbook0;
        if (totalbook1 >= 20) {
            price[1] = price[1] - price[1] * 12 / 100;
        } else {
            if (totalbook1 >= 10) {
                price[1] = price[1] - price[1] * 5 / 100;
            } else {
                if (totalbook1 >= 5) {
                    price[1] = price[1] - price[1] * 2 / 100;
                }
            }
        }
        totalprice[1] = price[1] * totalbook1;
        if (totalbook2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (totalbook2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (totalbook2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        totalprice[2] = price[2] * totalbook2;
        totalpriceall = totalprice[0] + totalprice[1] + totalprice[2];
        System.out.println(toFixed(totalpriceall,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
