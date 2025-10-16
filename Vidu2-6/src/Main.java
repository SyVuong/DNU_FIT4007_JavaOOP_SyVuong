import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        if (CanhTamGiac.isTriangle(a, b, c)) {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " có thể là 3 cạnh của một tam giác.");
        } else {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " không thể là 3 cạnh của một tam giác.");
        }

        sc.close();
    }
}
