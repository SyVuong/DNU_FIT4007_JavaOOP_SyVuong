import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b (b khác 0): ");
        int b = sc.nextInt();

        System.out.println(a + " / " + b + " = " + SoNguyen.divide(a, b));

        sc.close();
    }
}
