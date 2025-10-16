import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ba cạnh của tam giác:");
        System.out.print("Cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Cạnh c: ");
        double c = scanner.nextDouble();

        if (Triangle.isValid(a, b, c)) {
            double chuVi = Triangle.calculatePerimeter(a, b, c);
            double dienTich = Triangle.calculateArea(a, b, c);

            System.out.println("Chu vi của tam giác là: " + chuVi);
            System.out.println("Diện tích của tam giác là: " + dienTich);
        } else {
            System.out.println("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ.");
        }

        scanner.close();
    }
}