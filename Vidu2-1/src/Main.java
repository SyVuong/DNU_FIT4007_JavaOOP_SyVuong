import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int N = sc.nextInt();

        // Kiểm tra và in kết quả
        if (SoNguyen.isNaturalNumber(N)) {
            System.out.println(N + " là số tự nhiên.");
        } else {
            System.out.println(N + " không phải là số tự nhiên.");
        }

        sc.close();
    }
}
