public class Triangle {

    // Phương thức kiểm tra ba cạnh có tạo thành một tam giác hợp lệ không
    public static boolean isValid(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Tính chu vi của tam giác
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Tính diện tích của tam giác bằng công thức Heron
    public static double calculateArea(double a, double b, double c) {
        double s = calculatePerimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}