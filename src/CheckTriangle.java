import java.util.Scanner;

public class CheckTriangle {
    void Check() {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("==Check Triangel==");
        System.out.print("a = ");
        a = sc.nextFloat();
        System.out.print("b = ");
        b = sc.nextFloat();
        System.out.print("c = ");
        c = sc.nextFloat();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Đây là ba cạnh của một hình tam giác");
        } else {
            System.out.println("Đây không phải ba cạnh của một hình tam giác");
        }

    }
}
