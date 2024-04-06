package btth2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập mã số sinh viên:");
        int maSV = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Nhập họ và tên sinh viên:");
        String hoTen = scanner.nextLine();
        
        System.out.println("Nhập điểm Giải tích:");
        double diemGiaiTich = scanner.nextDouble();
        
        System.out.println("Nhập điểm Vật lý:");
        double diemVatLy = scanner.nextDouble();
        
        System.out.println("Nhập điểm Nhập môn lập trình:");
        double diemNhapMonLT = scanner.nextDouble();
        
        // Tạo đối tượng SinhVien từ thông tin nhập vào
        SinhVien sv = new SinhVien(maSV, hoTen, diemGiaiTich, diemVatLy, diemNhapMonLT);
        
        sv.hienThiThongTin();
        
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
        System.out.println("\n");
        System.out.println("Mã số sinh viên: " + maSV);
        System.out.println("Họ và tên sinh viên: " + hoTen);
        System.out.println("Điểm Giải tích: " + diemGiaiTich);
        System.out.println("Điểm Vật lý: " + diemVatLy);
        System.out.println("Điểm Nhập môn lập trình: " + diemNhapMonLT);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
}

