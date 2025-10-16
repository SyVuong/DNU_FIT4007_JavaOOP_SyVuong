import java.util.Scanner;

public class TinhNamSinh {
    // Hàm main - điểm bắt đầu của chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của sinh viên tính đến năm 2023: ");
        int tuoi = sc.nextInt();   // nhập tuổi

        int namSinh = 2023 - tuoi; // tính năm sinh

        System.out.println("Năm sinh của sinh viên là: " + namSinh);

        sc.close();
    }
}
