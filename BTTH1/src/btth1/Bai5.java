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
        
        System.out.println("Nhap lan luot 2 chuoi vao day");
        chuoi1 = scanner.nextLine();
        chuoi2 = scanner.nextLine();
        
        // 1.
        System.out.println("Tinh tong chieu dai cua 2 chuoi " + TongChieuDai(chuoi1, chuoi2) + "\t");
        
        // 2.
        System.out.println("Ba ky tu dau tien trong chuoi S1(" + chuoi1 + ") la " + LayBaKyTuDau(chuoi1) + "\t");
        
        // 3.
        System.out.println("Ba ky tu cuoi cua chuoi S2(" + chuoi2 + ") la " + LayBaKyTuCuoi(chuoi2) + "\t");
        
        // 4.
        System.out.println("Ky tu thu 6 trong chuoi (" + chuoi1 + ") la " + LayKyTuThu6(chuoi1) + "\t");
        
        // 5.
        if (Kiemtrachuoibangnhau(chuoi1, chuoi2))
            System.out.println("2 chuoi bang nhau." + "\n");
        else
            System.out.println("2 chuoi khong bang nhau." + "\t");
        
        // 6.
        if (Checkchuoilongnhau(chuoi1, chuoi2) < 0)
            System.out.println("Chuoi 2 khong nam trong chuoi 1. " + "\t");
        else
            System.out.println("Chuoi 2 nam trong chuoi 1 o vi tri " + Checkchuoilongnhau(chuoi1, chuoi2));
    }
}