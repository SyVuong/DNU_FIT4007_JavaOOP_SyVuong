import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int length = sc.nextInt();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = sc.nextInt();

        if (Canh.isSquare(length, width)) {
            System.out.println("Hình chữ nhật là hình vuông.");
        } else {
            System.out.println("Hình chữ nhật không phải là hình vuông.");
        }

        sc.close();
    }
}
