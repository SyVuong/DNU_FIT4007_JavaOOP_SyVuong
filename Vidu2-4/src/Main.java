import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        int maxValue = SoNguyen.max(a, b);
        System.out.println("Số lớn hơn giữa " + a + " và " + b + " là: " + maxValue);

        sc.close();
    }
}
