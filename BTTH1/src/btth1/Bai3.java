package btth1;

import java.util.Scanner;

public class Bai3 {
    // Kiểm tra ba giá trị có phải là ba cạnh tam giác không
    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }
    
    // Tính chu vi tam giác
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Tính diện tích tam giác
    public static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c;

        System.out.print("\nNhập vào cạnh thứ nhất: ");
        a = input.nextFloat();
	    System.out.print("\nNhập vào cạnh thứ hai: ");
        b = input.nextFloat();
	    System.out.print("\nNhập vào cạnh thứ ba: ");
        c = input.nextFloat();

        if (isValidTriangle(a, b, c)) {
            double perimeter = calculatePerimeter(a, b, c);
            System.out.println("\nChu vi hình tam giác là: " + perimeter);

            double area = calculateArea(a, b, c);
            System.out.println("\nDiện tích hình tam giác là: " + area);
        } else {
            System.out.println("\nBa cạnh trên không thể tạo thành một tam giác hợp lệ!");
        }

        input.close();
    }
}
