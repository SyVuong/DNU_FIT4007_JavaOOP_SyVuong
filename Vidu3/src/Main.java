// File: Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        if (length <= 0 || width <= 0) {
            System.out.println("Chiều dài và chiều rộng phải là số dương.");
        } else {
            // Call methods from the Rectangle class
            double perimeter = Rectangle.calculatePerimeter(length, width);
            double area = Rectangle.calculateArea(length, width);

            System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
            System.out.println("Diện tích của hình chữ nhật là: " + area);
        }

        scanner.close();
    }
}