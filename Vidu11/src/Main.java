import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        int[] swapped = SoNguyen.swap(a, b);

        System.out.println("Sau khi hoán đổi: a = " + swapped[0] + ", b = " + swapped[1]);

        sc.close();
    }
}
