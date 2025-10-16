import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên N (ít nhất 2 chữ số): ");
        int N = sc.nextInt();

        if (Math.abs(N) < 10) {
            System.out.println("Số phải có ít nhất 2 chữ số!");
        } else {
            int secondLastDigit = SoNguyen.getSecondLastDigit(N);
            System.out.println("Chữ số gần cuối của " + N + " là: " + secondLastDigit);
        }
        sc.close();
    }
}
