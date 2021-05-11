import java.util.Scanner;

public class QuadraticEquation {
    void QE() {
        double s;
        float a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("==Quadratic Equation==");
        System.out.print("a = ");
        a = sc.nextFloat();
        System.out.print("b = ");
        b = sc.nextFloat();
        System.out.print("c = ");
        c = sc.nextFloat();
        delta = b * b - 4 * a * c;
        System.out.println("delta = " +delta);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        } else if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}



