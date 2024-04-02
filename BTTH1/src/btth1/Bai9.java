package btth1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai9 {
    // Hàm tạo danh sách ngẫu nhiên các công dân từ 0 đến N - 1
    public static List<Integer> generateRandomCitizens(int N) {
        List<Integer> citizens = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            citizens.add(i);
        }
        
        Collections.shuffle(citizens); // Xáo trộn danh sách
        
        return citizens;
    }

    // Hàm in ra danh sách tiếp xúc của mỗi công dân
    public static void printCitizenContacts(List<Integer> citizens) {
        System.out.println("Danh sách tiếp xúc của các công dân:");
        
        for (int i = 0; i < citizens.size(); i++) {
            int citizen = citizens.get(i);
            
            System.out.printf("Công dân %d đã tiếp xúc với công dân %d\n", i, citizen);
        }
    }
    
    public static void main(String[] args) {
            int N = 16; // Số lượng công dân
            
            List<Integer> citizens = generateRandomCitizens(N);
            printCitizenContacts(citizens);
    }
}
