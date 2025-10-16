import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập ký tự từ a đến y
        System.out.print("Nhập một ký tự thường từ 'a' đến 'y': ");
        char ch = sc.next().charAt(0);

        // In ký tự liền sau
        System.out.println("Ký tự liền sau '" + ch + "' là: " + KiTu.getNextChar(ch));

        sc.close();
    }
}
