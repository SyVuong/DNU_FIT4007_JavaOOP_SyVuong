import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int N = sc.nextInt();

        if (SoNguyen.isEven(N)) {
            System.out.println(N + " là số chẵn.");
        } else {
            System.out.println(N + " là số lẻ.");
        }

        sc.close();
    }
}
