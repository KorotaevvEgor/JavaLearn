/**
 По данному трехзначному числу определить, все ли его цифры различны.
 На вход функции подается одно натуральное трехзначное число.
 Выведите "YES", если все цифры числа различны, в противном случае - "NO".
 Sample Input 1: 237 / Sample Output 1: YES
 Sample Input 2: 117 / Sample Output 2: NO
 **/

import java.util.Scanner;

public class Step1 {
    public Step1() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int num = in.nextInt();
        if (checkIfPartsOfNumberDiffer(num)) {
            System.out.println("No/False");
        } else {
            System.out.println("Yes/True");
        }

    }

    public static Boolean checkIfPartsOfNumberDiffer(int num) {
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;
        return a == b || b == c || a == c;
    }
}