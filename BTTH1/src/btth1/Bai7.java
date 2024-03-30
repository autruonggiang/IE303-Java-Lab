package btth1;

import java.util.Arrays;

public class Bai7 {
    public static void main(String[] args) {
        int n = 5; // Kích thước của mảng A
        int m = 3; // Kích thước của mảng B

        // 1. Tạo mảng B với các giá trị ngẫu nhiên
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = (int) (Math.random() * 100); // Giả sử giá trị ngẫu nhiên từ 0 đến 99
        }

        // 2. Xuất toàn bộ các phần tử của B ra màn hình
        System.out.println("Mảng B: " + Arrays.toString(B));

        // Mảng số nguyên A
        int[] A = {1, 2, 3, 4, 5};

        // 3. Tạo mảng C từ mảng A
        int[] C = Arrays.copyOf(A, A.length);

        // 4. Thay thế phần tử thứ 1 đến 3 của mảng C bằng 3 phần tử cuối của mảng B
        System.arraycopy(B, m - 3, C, 0, 3);

        // 5. Sắp xếp mảng C tăng dần và xuất ra màn hình
        Arrays.sort(C);
        System.out.println("Mảng C (sau khi sắp xếp): " + Arrays.toString(C));
    } 
}

