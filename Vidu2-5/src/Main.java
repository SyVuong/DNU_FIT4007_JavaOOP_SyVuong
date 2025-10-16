import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm: ");
        double score = sc.nextDouble();

        if (DiemSo.isValidScore(score)) {
            System.out.println(score + " là điểm hợp lí.");
        } else {
            System.out.println(score + " không phải là điểm hợp lí.");
        }

        sc.close();
    }
}
