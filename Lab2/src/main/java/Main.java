
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Введіть число:");
        Scanner vvid = new Scanner(System.in);
        int count = vvid.nextInt();
        int[] numbersArray = new int[count];
        int max = numbersArray[0];
        int min = numbersArray[0];

        int countNeg;
        for(countNeg = 0; countNeg < count; ++countNeg) {
            System.out.println("Введіть значення " + countNeg + " елемента массива:");
            numbersArray[countNeg] = vvid.nextInt();
        }

        for(countNeg = 0; countNeg < numbersArray.length - 1; ++countNeg) {
            if (numbersArray[countNeg] < min) {
                min = numbersArray[countNeg];
            }

            if (numbersArray[countNeg] > max) {
                max = numbersArray[countNeg];
            }
        }

        if (min > 0) {
            System.out.println("Середнє геометричне максимального і мінімального елементів масиву = " + Math.sqrt((double)(min * max)));
        } else {
            System.out.println("Неможливо знайти середнє геометричне значення, тому що присутнє від'ємне число.");
        }

        countNeg = 0;
        int countPos = 0;

        for(int r = 0; r < numbersArray.length; ++r) {
            if (numbersArray[r] < 0) {
                ++countNeg;
            } else {
                ++countPos;
            }
        }

        int[] negative = new int[countNeg];
        int[] positive = new int[countPos];
        int sumNeg = 0;
        int sumPos = 0;

        int dif;
        for(dif = 0; sumNeg < numbersArray.length; ++sumNeg) {
            if (numbersArray[sumNeg] < 0) {
                negative[sumPos] = numbersArray[sumNeg];
                ++sumPos;
            } else {
                positive[dif] = numbersArray[sumNeg];
                ++dif;
            }
        }

        sumNeg = 0;

        for(sumPos = 0; sumPos < negative.length; ++sumPos) {
            sumNeg += negative[sumPos];
        }

        sumPos = 0;

        for(dif = 0; dif < positive.length; ++dif) {
            sumPos += positive[dif];
        }

        dif = sumPos - Math.abs(sumNeg);
        System.out.println("Різниця між позитивними та негативними елементами масиву = " + Math.abs(dif));
        System.out.println("Кількість позитивних елементів в масиві = " + countPos);
        System.out.println("Сума негативних елементів масиву = " + sumNeg);
        int sumMult = 0;

        int j;
        for(j = 0; j < numbersArray.length; ++j) {
            if (j % 3 == 0 && j != 0) {
                sumMult += numbersArray[j];
            }
        }

        System.out.println("Сума елементів масиву, в яких індекс має кратне число 3 = " + sumMult);
        j = max * min;
        System.out.println("Добуток найбільшого і найменшого елементу масиву = " + j);
    }
}
