package btth2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng sinh viên
        System.out.println("1. Nhập số lượng sinh viên:");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        // Khởi tạo mảng lưu trữ sinh viên
        SinhVien[] danhSachSV = new SinhVien[n];
        
        // Nhập thông tin cho từng sinh viên và lưu vào mảng
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            
            int maSV;
            while (true) {
                System.out.println("Nhập mã số sinh viên:");
                String input = scanner.nextLine();
                try {
                    maSV = Integer.parseInt(input);
                    break; // Thoát khỏi vòng lặp khi nhập mã số sinh viên thành công
                } catch (NumberFormatException e) {
                    System.out.println("\nMã số sinh viên phải là số nguyên. Vui lòng nhập lại!");
                }
            }
            
            System.out.println("Nhập họ và tên sinh viên:");
            String hoTen = scanner.nextLine();
            
            double diemGiaiTich;
            do {
                System.out.println("Nhập điểm Giải tích (từ 0 đến 10):");
                diemGiaiTich = scanner.nextDouble();
                if (diemGiaiTich < 0 || diemGiaiTich > 10) {
                    System.out.println("Điểm Giải tích phải từ 0 đến 10. Vui lòng nhập lại!");
                }
            } while (diemGiaiTich < 0 || diemGiaiTich > 10);
            
            double diemVatLy;
            do {
                System.out.println("Nhập điểm Vật lý:");
                diemVatLy = scanner.nextDouble();
                if (diemVatLy < 0 || diemVatLy > 10) {
                    System.out.println("Điểm Vật lý phải từ 0 đến 10. Vui lòng nhập lại!");
                }
            } while (diemVatLy < 0 || diemVatLy > 10);
            
            double diemNhapMonLT;
            do {
                System.out.println("Nhập điểm Nhập môn lập trình:");
                diemNhapMonLT = scanner.nextDouble();
                if (diemNhapMonLT < 0 || diemNhapMonLT > 10) {
                    System.out.println("Điểm Nhập môn lập trình phải từ 0 đến 10. Vui lòng nhập lại!");
                }
            } while (diemNhapMonLT < 0 || diemNhapMonLT > 10);
            
            // Tạo đối tượng SinhVien từ thông tin nhập vào và lưu vào mảng
            danhSachSV[i] = new SinhVien(maSV, hoTen, diemGiaiTich, diemVatLy, diemNhapMonLT);
        }
        
        // Hiển thị thông tin của từng sinh viên trong danh sách
        System.out.println("\n2. ");
        for (int i = 0; i < n; i++) {
            System.out.println("\nThông tin sinh viên thứ " + (i + 1) + ":");
            danhSachSV[i].hienThiThongTin();
            System.out.println();
        }
        
        // Liệt kê danh sách sinh viên được nhận học bổng
        System.out.println("3. Danh sách sinh viên được nhận học bổng:");
        for (int i = 0; i < n; i++) {
            if (danhSachSV[i].duocNhanHocBong()) {
                System.out.println(danhSachSV[i].getHoTen());
            }
        }
        
         // Xuất thông tin sinh viên có điểm trung bình cao nhất
        double diemCaoNhat = SinhVien.timDiemTrungBinhCaoNhat(danhSachSV, n);
        System.out.println("\n4. Sinh viên có điểm trung bình cao nhất:");
        for (int i = 0; i < n; i++) {
            if (danhSachSV[i].getDiemTrungBinh() == diemCaoNhat) {
                danhSachSV[i].hienThiThongTin();
                break;
            }
        }
        
         // Sắp xếp danh sách sinh viên giảm dần theo điểm trung bình
        Arrays.sort(danhSachSV, Comparator.comparing(SinhVien::getDiemTrungBinh).reversed());
        
        // Xuất danh sách top 10 sinh viên có điểm cao nhất
        System.out.println("\n5. Top 10 sinh viên có điểm cao nhất:");
        int topCount = Math.min(10, n);
        for (int i = 0; i < topCount; i++) {
            danhSachSV[i].hienThiThongTin();
            System.out.println();
        }
        
        scanner.close();
    }
}

class SinhVien {
    // Khai báo các thuộc tính của sinh viên
    private int maSV;
    private String hoTen;
    private double diemGiaiTich;
    private double diemVatLy;
    private double diemNhapMonLT;
    private double diemTrungBinh;
    
    // Constructor để khởi tạo đối tượng SinhVien
    public SinhVien(int maSV, String hoTen, double diemGiaiTich, double diemVatLy, double diemNhapMonLT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemGiaiTich = diemGiaiTich;
        this.diemVatLy = diemVatLy;
        this.diemNhapMonLT = diemNhapMonLT;
        // Tính điểm trung bình
        this.diemTrungBinh = (diemGiaiTich + diemVatLy + diemNhapMonLT) / 3;
    }
    
    // Phương thức để lấy mã số sinh viên
    public int getMaSV() {
        return maSV;
    }
    
    // Phương thức để lấy họ tên sinh viên
    public String getHoTen() {
        return hoTen;
    }
    
    // Phương thức để lấy điểm Giải tích
    public double getDiemGiaiTich() {
        return diemGiaiTich;
    }
    
    // Phương thức để lấy điểm Vật lý
    public double getDiemVatLy() {
        return diemVatLy;
    }
    
    // Phương thức để lấy điểm Nhập môn lập trình
    public double getDiemNhapMonLT() {
        return diemNhapMonLT;
    }
    
    // Phương thức để lấy điểm trung bình
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    // Phương thức để hiển thị thông tin của sinh viên
    public void hienThiThongTin() {
        System.out.println("Mã số sinh viên: " + maSV);
        System.out.println("Họ và tên sinh viên: " + hoTen);
        System.out.println("Điểm Giải tích: " + diemGiaiTich);
        System.out.println("Điểm Vật lý: " + diemVatLy);
        System.out.println("Điểm Nhập môn lập trình: " + diemNhapMonLT);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
    
    // Phương thức kiểm tra xem sinh viên có được nhận học bổng hay không
    public boolean duocNhanHocBong() {
        return (diemTrungBinh >= 8.0 && diemNhapMonLT >= 9.0);
    }
    
    public static double timDiemTrungBinhCaoNhat(SinhVien[] danhSachSV, int n) {
        double diemCaoNhat = 0;
        for (int i = 0; i < n; i++) {
            if (danhSachSV[i].getDiemTrungBinh() > diemCaoNhat) {
                diemCaoNhat = danhSachSV[i].getDiemTrungBinh();
            }
        }
        return diemCaoNhat;
    }
}

