package btth1;

import java.util.Scanner;

public class Bai8 {
    // Hàm tạo số bí mật trong khoảng từ 0 đến n
    public static int generateSecretNumber(int n) {
        return (int) (Math.random() * n);
    }

    // Hàm chơi trò chơi
    public static void playGame(Scanner scanner, int secretNumber, int low, int high, int guesses) {
        while (true) {
            System.out.printf("Đoán số trong khoảng từ %d đến %d: ", low, high);
            int guess = scanner.nextInt();
            guesses++;

            if (guess < low || guess > high) {
                System.out.println("\nSố bạn nhập không nằm trong phạm vi cho phép. Vui lòng nhập lại.");
                continue;
            }

            if (guess == secretNumber) {
                System.out.println("Chúc mừng! Bạn đã đoán đúng số bí mật " + secretNumber);
                System.out.println("Bạn đã đoán đúng sau " + guesses + " lần đoán.");
                break;
            } else if (guess < secretNumber) {
                low = guess + 1;
                System.out.println("\nSố bạn đoán nhỏ hơn số bí mật.");
            } else {
                high = guess - 1;
                System.out.println("\nSố bạn đoán lớn hơn số bí mật.");
            }

            // Kiểm tra nếu chỉ còn một số để đoán
            if (low == high) {
                System.out.println("Bạn đã hết số lần đoán. Số bí mật là " + secretNumber);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo số bí mật trong khoảng từ 0 đến n
        int n = 100; // Đổi nếu muốn thay đổi phạm vi
        int secretNumber = generateSecretNumber(n);

        // Phạm vi hiện tại
        int low = 0;
        int high = n - 1;

        // Số lần đoán
        int guesses = 0;

        System.out.println("Chào mừng bạn đến với trò chơi đoán số!");
        System.out.println("Số bí mật đã được tạo. Hãy đoán số!");

        // Bắt đầu trò chơi
        playGame(scanner, secretNumber, low, high, guesses);

        scanner.close();
    }
}
