package btth1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai4 {
    // Hàm đếm số chữ số
    private static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Hàm kiểm tra số đối xứng
    private static boolean isPalindromeNumber(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    // Hàm kiểm tra số chính phương
    private static boolean isPerfectSquareNumber(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            try {
                System.out.print("Nhap vao so duong n: ");
                n = input.nextInt();

                if (n <= 0) {
                    System.out.println("Vui long nhap mot so nguyen duong!");
                }
            } catch (InputMismatchException e) {
                System.out.println("So n phai so nguyen!");
                input.next(); 
                n = 0; 
            }
        } while (n <= 0);

        System.out.print("Cac uoc so cua " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int digitCount = countDigits(n);
        System.out.println("So " + n + " co " + digitCount + " chu so.");

        boolean isPalindrome = isPalindromeNumber(n);
        if (isPalindrome) {
            System.out.println("So " + n + " la so doi xung.");
        } else {
            System.out.println("So " + n + " khong la so doi xung.");
        }

        boolean isPerfectSquare = isPerfectSquareNumber(n);
        if (isPerfectSquare) {
            System.out.println("So " + n + " la so chinh phuong.");
        } else {
            System.out.println("So " + n + " khong la so chinh phuong.");
        }

        input.close();
    }
}
