package btth1;

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Bai6 {
    // Hàm so sánh 2 ngày
    public static int Sosanh2ngay(Calendar a, Calendar b) {
            return a.compareTo(b);
        }

    // Hàm kiểm tra năm nhuận
        public static boolean Kiemtranamnhuan(Calendar a) {
            int year = a.get(Calendar.YEAR);
            
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        return true;
                    
                    else
                        return false;
                } 
                
                else
                    return true;
            }
            
            return false;
        }

        // Hàm tính số ngày trong tháng
        public static int Timsongaytrongthang(Calendar a) {
            int thang = a.get(Calendar.MONTH) + 1;
            
            switch (thang) {
            case 1:
                
            case 3:
                
            case 5:
                
            case 7:
                
            case 8:
                
            case 10:
                
            case 12:
                
                return 31;
                
            case 4:
                
            case 6:
                
            case 9:
                
            case 11:
                return 30;
                
            case 2:
                if (Kiemtranamnhuan(a))
                    return 29;
                
                else
                    return 28;
            }
            
            return 0;
        }

        public static void main(String[] args) {
            String ngay1, ngay2;
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Nhập lần lượt 2 ngày vào đây (dd/MM/yyyy) ví dụ(27/3/2021)");
            ngay1 = scanner.nextLine();
            ngay2 = scanner.nextLine();
            
            SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
            df1.setLenient(false);
            df2.setLenient(false);
            
            try {
                Date date1 = df1.parse(ngay1);
                Date date2 = df1.parse(ngay2);
                
                Calendar cal1 = Calendar.getInstance();
                Calendar cal2 = Calendar.getInstance();
                
                cal1.setTime(date1);
                cal2.setTime(date2);
                
                if (Sosanh2ngay(cal1, cal2) < 0)
                    System.out.println("Ngày " + cal1.getTime() + " nhỏ hơn ngày " + cal2.getTime());
                
                else if (Sosanh2ngay(cal1, cal2) > 0)
                    System.out.println("Ngày " + cal1.getTime() + " lớn hơn ngày " + cal2.getTime());
               
                else
                    System.out.println("Ngày " + cal1.getTime() + " bằng ngày " + cal2.getTime());
                cal1.add(Calendar.DATE, 1);
                System.out.println("Ngày a ngày kế tiếp là " + cal1.getTime());
                
                cal1.add(Calendar.DATE, -2);
                System.out.println("Ngày a ngày trước đó là " + cal1.getTime());
                
                cal1.add(Calendar.DATE, 1);
                System.out.println("Ngày a là ngày " + cal1.get(Calendar.DAY_OF_YEAR) + " trong năm.");
                System.out.println("Tháng a là tháng có "+Timsongaytrongthang(cal1)+ " ngày trong tháng.");
                
                if (Kiemtranamnhuan(cal1))
                    System.out.println("Năm a là năm nhuận.");
                
                else 
                    System.out.println("Năm a là năm không nhuận.");
            }
            
            catch (ParseException e) {
                System.out.println("Ngày tháng năm không hợp lệ!");
            }
        }
}