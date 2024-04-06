package btth2;

import java.util.Scanner;

// Định nghĩa lớp Point để biểu diễn tọa độ điểm
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2));
    }
}

// Định nghĩa lớp Fraction để biểu diễn phân số
class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getDecimalValue() {
        return (double) numerator / denominator;
    }
}

// Định nghĩa lớp Shape là lớp cơ sở cho các hình học
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Định nghĩa lớp Square kế thừa từ lớp Shape
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Định nghĩa lớp Circle kế thừa từ lớp Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Định nghĩa lớp Rectangle kế thừa từ lớp Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Định nghĩa lớp Triangle kế thừa từ lớp Shape
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        // Sử dụng công thức Heron để tính diện tích tam giác
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập vào tọa độ 2 điểm A và B. Tính khoảng cách AB.
        System.out.println("Nhập vào tọa độ điểm A:");
        System.out.print("x(A) = ");
        double xA = scanner.nextDouble();
        System.out.print("y(A) = ");
        double yA = scanner.nextDouble();

        System.out.println("\nNhập vào tọa độ điểm B:");
        System.out.print("x(B) = ");
        double xB = scanner.nextDouble();
        System.out.print("y(B) = ");
        double yB = scanner.nextDouble();

        Point pointA = new Point(xA, yA);
        Point pointB = new Point(xB, yB);

        double distanceAB = pointA.distanceTo(pointB);
        System.out.println("\nKhoảng cách giữa hai điểm A và B là: " + distanceAB);

        // 2. Cho 2 phân số a và b. Tính tổng, hiệu, tích, thương giữa chúng.
        System.out.println("\nNhập vào phân số a:");
        System.out.print("Tử số: ");
        int numeratorA = scanner.nextInt();
        System.out.print("Mẫu số: ");
        int denominatorA = scanner.nextInt();
        Fraction fractionA = new Fraction(numeratorA, denominatorA);

        System.out.println("\nNhập vào phân số b:");
        System.out.print("Tử số: ");
        int numeratorB = scanner.nextInt();
        System.out.print("Mẫu số: ");
        int denominatorB = scanner.nextInt();
        Fraction fractionB = new Fraction(numeratorB, denominatorB);

        // Tính toán tổng, hiệu, tích, thương
        double sum = fractionA.getDecimalValue() + fractionB.getDecimalValue();
        double difference = fractionA.getDecimalValue() - fractionB.getDecimalValue();
        double product = fractionA.getDecimalValue() * fractionB.getDecimalValue();
        double quotient = fractionA.getDecimalValue() / fractionB.getDecimalValue();

        System.out.println("\nTổng của hai phân số là: " + sum);
        System.out.println("Hiệu của hai phân số là: " + difference);
        System.out.println("Tích của hai phân số là: " + product);
        System.out.println("Thương của hai phân số là: " + quotient);

        // 3. Nhập vào thông tin hình vuông, hình tròn, hình chữ nhật, hình tam giác.
        // Xuất các thông tin và tính chu vi, diện tích của các hình đó.
        Square square = createSquare(scanner);
        Circle circle = createCircle(scanner);
        Rectangle rectangle = createRectangle(scanner);
        Triangle triangle = createTriangle(scanner);

        printShapeInfo("hình vuông", square);
        printShapeInfo("hình tròn", circle);
        printShapeInfo("hình chữ nhật", rectangle);
        printShapeInfo("hình tam giác", triangle);
    }

    private static Square createSquare(Scanner scanner) {
        System.out.println("\nNhập thông tin hình vuông:");
        System.out.print("Cạnh: ");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static Circle createCircle(Scanner scanner) {
        System.out.println("\nNhập thông tin hình tròn:");
        System.out.print("Bán kính: ");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

    private static Rectangle createRectangle(Scanner scanner) {
        System.out.println("\nNhập thông tin hình chữ nhật:");
        System.out.print("Chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Chiều rộng: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }

    private static Triangle createTriangle(Scanner scanner) {
        System.out.println("\nNhập thông tin hình tam giác:");
        System.out.print("Cạnh a: ");
        double sideA = scanner.nextDouble();
        System.out.print("Cạnh b: ");
        double sideB = scanner.nextDouble();
        System.out.print("Cạnh c: ");
        double sideC = scanner.nextDouble();
        return new Triangle(sideA, sideB, sideC);
    }

    private static void printShapeInfo(String shapeName, Shape shape) {
        System.out.println("\nThông tin và tính toán cho " + shapeName + ":");
        System.out.println("Diện tích: " + shape.calculateArea());
        System.out.println("Chu vi: " + shape.calculatePerimeter());
    }
}