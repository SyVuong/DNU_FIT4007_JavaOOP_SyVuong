import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        System.out.println("Chu vi = " + chuVi);
        System.out.println("Dien tich = " + dienTich);

        sc.close();
    }
}
