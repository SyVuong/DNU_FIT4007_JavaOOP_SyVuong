import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số thực: ");
        double number = sc.nextDouble();

        if (SoThuc.isInteger(number)) {
            System.out.println(number + " là số nguyên.");
        } else {
            System.out.println(number + " không phải là số nguyên.");
        }

        sc.close();
    }
}
