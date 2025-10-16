import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giờ h (0-23): ");
        int h = sc.nextInt();
        System.out.print("Nhập phút m (0-59): ");
        int m = sc.nextInt();

        System.out.printf("Thời gian hiện tại: %02d:%02d\n", h, m);

        int[] nextTime = ThoiGian.timeAfterOneMinute(h, m);
        System.out.printf("Thời gian sau 1 phút: %02d:%02d\n", nextTime[0], nextTime[1]);

        sc.close();
    }
}
