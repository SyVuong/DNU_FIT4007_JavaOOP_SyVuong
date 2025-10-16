import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ban kinh hinh tron r: ");
        double r = sc.nextDouble();

        if (r > 0) {
            double chuVi = HinhTron.tinhChuVi(r);
            double dienTich = HinhTron.tinhDienTich(r);

            System.out.println("Chu vi hinh tron: " + chuVi);
            System.out.println("Dien tich hinh tron: " + dienTich);
        } else {
            System.out.println("Ban kinh phai la so duong!");
        }

        sc.close();
    }
}