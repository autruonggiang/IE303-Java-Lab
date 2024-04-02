package btth1;

import java.util.Scanner;

public class Bai5 {
    // 1. Cho biết tổng chiều dài 2 chuỗi s1 và s2.
    public static int TongChieuDai(String a, String b) {
        return a.length() + b.length();
    }

    // 2. Lấy 3 kí tự đầu tiên chuỗi s1.
    public static String LayBaKyTuDau(String a) {
        return a.substring(0, 3);
    }

    // 3. Lấy 3 kí tự cuối của chuỗi s2.
    public static String LayBaKyTuCuoi(String a) {
        return a.substring(a.length() - 3, a.length());
    }
    
    // 4. Lấy kí tự thứ 6 của chuỗi s1.
    public static char LayKyTuThu6(String a) {
        return a.charAt(5);
    }

    // 5. Kiểm tra 2 chuỗi s1 và s2 có bằng nhau không?
    public static boolean Kiemtrachuoibangnhau(String a, String b) {
        if (a.length() - b.length() == 0)
            return true;
        return false;
    }

    // 6. Cho biết s2 có xuất hiện trong s1 hay không? Nếu có thì đó là vị trí nào?
    public static int Checkchuoilongnhau(String a, String b) {
        return a.indexOf(b);
    }

    public static void main(String[] args) {
        String chuoi1, chuoi2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nHãy nhập lần lượt 2 chuỗi vào bên dưới: ");
        chuoi1 = scanner.nextLine();
        chuoi2 = scanner.nextLine();
        
        // 1.
        System.out.println("\n Tổng chiều dài 2 chuỗi là: " + TongChieuDai(chuoi1, chuoi2) + "\t");
        
        // 2.
        System.out.println("\nBa ký tự đầu tiên của chuỗi s1(" + chuoi1 + ") là: " + LayBaKyTuDau(chuoi1) + "\t");
        
        // 3.
        System.out.println("\nBa ký tự cuối của chuỗi s2(" + chuoi2 + ") là: " + LayBaKyTuCuoi(chuoi2) + "\t");
        
        // 4.
        System.out.println("\nKý tự thứ 6 trong chuỗi (" + chuoi1 + ") là: " + LayKyTuThu6(chuoi1) + "\t");
        
        // 5.
        if (Kiemtrachuoibangnhau(chuoi1, chuoi2))
            System.out.println("\n2 chuỗi s1 và s2 bằng nhau." + "\n");
        
        else
            System.out.println("\n2 chuỗi s1 và s2 không bằng nhau." + "\t");
        
        // 6.
        if (Checkchuoilongnhau(chuoi1, chuoi2) < 0)
            System.out.println("\nChuỗi s2 không xuất hiện trong chuỗi s1." + "\t");
        
        else
            System.out.println("\nChuỗi s2 xuất hiện trong chuỗi s1 ở vị trí: " + Checkchuoilongnhau(chuoi1, chuoi2));
    }
}