public class ThoiGian {

    public static int[] timeAfterOneMinute(int h, int m) {
        m += 1; // tăng 1 phút
        if (m == 60) {
            m = 0;
            h += 1;
            if (h == 24) {
                h = 0;
            }
        }
        return new int[]{h, m};
    }
}
