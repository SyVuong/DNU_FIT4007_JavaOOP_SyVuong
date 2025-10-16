import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();

        if (SoNguyen.isDivisorAndMultiple(a, b, c)) {
            System.out.println(b + " vừa là ước của " + a + " vừa là bội của " + c + ".");
        } else {
            System.out.println(b + " không phải vừa là ước của " + a + " vừa là bội của " + c + ".");
        }

        sc.close();
    }
}
