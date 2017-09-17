//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Matrix {
    public Matrix() {
    }

    public static void main(String[] args) {
        System.out.println("Введіть розмір матриці:");
        Scanner vvid = new Scanner(System.in);
        int countM = vvid.nextInt();
        int[][] matrix = new int[countM][countM];

        int sum;
        int r;
        for (sum = 0; sum < countM; ++sum) {
            for (r = 0; r < countM; ++r) {
                matrix[sum][r] = (int) (Math.random() * 100.0D);
        }
        }

        sum = 0;
        r = 0;
    }
}