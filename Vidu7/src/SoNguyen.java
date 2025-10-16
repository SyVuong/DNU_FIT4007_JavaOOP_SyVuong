public class SoNguyen {
    public static int getSecondLastDigit(int n) {
        n = Math.abs(n);
        return (n / 10) % 10;
    }
}
