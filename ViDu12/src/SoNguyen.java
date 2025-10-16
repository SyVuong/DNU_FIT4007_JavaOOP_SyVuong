public class SoNguyen {
    public static int[] swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }
}
