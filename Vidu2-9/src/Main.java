import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (SoChinhPhuong.isPerfectSquare(N)) {
            System.out.println(N + " là số chính phương.");
        } else {
            System.out.println(N + " không phải là số chính phương.");
        }
        sc.close();
    }
}
