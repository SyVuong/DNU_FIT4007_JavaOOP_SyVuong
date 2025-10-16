import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên N: ");
        int N = sc.nextInt();

        int lastDigit = SoNguyen.getLastDigit(N);

        // In kết quả
        System.out.println("Chữ số cuối cùng của " + N + " là: " + lastDigit);

        sc.close();
    }
}
