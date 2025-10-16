import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập góc a: ");
        int a = sc.nextInt();
        System.out.print("Nhập góc b: ");
        int b = sc.nextInt();
        System.out.print("Nhập góc c: ");
        int c = sc.nextInt();

        if (SoNguyen.isTriangleAngles(a, b, c)) {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " có thể là 3 góc của một tam giác.");
        } else {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " không thể là 3 góc của một tam giác.");
        }

        sc.close();
    }
}
