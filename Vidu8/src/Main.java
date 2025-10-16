import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();

        int length = DoDai.getStringLength(name);

        System.out.println("Độ dài tên của bạn là: " + length);

        sc.close();
    }
}
