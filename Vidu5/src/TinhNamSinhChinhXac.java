import java.util.Scanner;

public class TinhNamSinhChinhXac {
    // Hàm main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của sinh viên tính đến năm 2023: ");
        int tuoi = sc.nextInt();
        sc.nextLine(); // bỏ ký tự xuống dòng còn lại

        System.out.print("Sinh viên đã qua sinh nhật trong năm 2023 chưa? (y/n): ");
        String daSinhNhat = sc.nextLine().trim().toLowerCase();

        int namSinh;
        if (daSinhNhat.equals("y")) {
            namSinh = 2023 - tuoi;
        } else {
            namSinh = 2023 - tuoi - 1;
        }

        System.out.println("Năm sinh chính xác là: " + namSinh);

        sc.close();
    }
}
