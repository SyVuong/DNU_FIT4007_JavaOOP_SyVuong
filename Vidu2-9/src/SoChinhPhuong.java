public class SoChinhPhuong {
    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        double sqrt = Math.sqrt(n);
        return sqrt == (int) sqrt;
    }
}
