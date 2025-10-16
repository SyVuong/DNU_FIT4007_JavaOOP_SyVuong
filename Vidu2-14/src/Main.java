import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        String result = Chuoi.longerString(a, b);
        System.out.println("Chuỗi dài hơn là: " + result);

        sc.close();
    }
}
