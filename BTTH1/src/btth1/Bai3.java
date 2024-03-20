package btth1;

import java.util.Scanner;

public class Bai3 {
    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c;

        System.out.print("\nNhap vao canh thu nhat: ");
        a = input.nextFloat();
	    System.out.print("\nNhap vao canh thu hai: ");
        b = input.nextFloat();
	    System.out.print("\nNhap vao canh thu ba: ");
        c = input.nextFloat();

        if (isValidTriangle(a, b, c)) {
            double perimeter = calculatePerimeter(a, b, c);
            System.out.println("\nChu vi hinh tam giac la: " + perimeter);

            double area = calculateArea(a, b, c);
            System.out.println("\nDien tich hinh tam giac la: " + area);
        } else {
            System.out.println("Ba canh tren khong the tao thanh mot tam giac hop le!");
        }

        input.close();
    }
}
