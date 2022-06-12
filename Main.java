package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double S = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n ");
        int n = in.nextInt();
        // проверка отрицательности n
        if (n < 0){
            System.out.println("n должен быть положительным");
        }
        System.out.println("Введите x");
        int x = in.nextInt();
        for (var j = 0; j <= n; j++) {
            double e = ((-1) ^ n) * ((x) ^ 2 * n) / (getFactorial(n));
            S = S + e;
        }
        System.out.println(S);
    }
    //Считает факториал
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
