import java.util.Scanner;

public class NumberDayOfMonthUseIf {
    int month;
    void NumberDay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Month = ");
        month = sc.nextInt();
        if (month == 1) {
            System.out.println("There are 31 days in January");
        }
        else if (month == 2) {
            System.out.println("There are 28 or 29 days in February");
        }
        else if (month == 3) {
            System.out.println("There are 31 days in March");
        }
        else if (month == 4) {
            System.out.println("There are 30 days in April");
        }
        else if (month == 5) {
            System.out.println("There are 31 days in May");
        }
        else if (month == 6) {
            System.out.println("There are 30 days in June");
        }
        else if (month == 7) {
            System.out.println("There are 31 days in July");
        }
        else if (month == 8) {
            System.out.println("There are 31 days in August");
        }
        else if (month == 9) {
            System.out.println("There are 30 days in September");
        }
        else if (month == 10) {
            System.out.println("There are 31 days in October");
        }
        else if (month == 11) {
            System.out.println("There are 31 days in December");
        } else if (month == 12) {
            System.out.println("There are 31 days in December");
        }
        else {
            System.out.println("Please input month from 1 to 12");
        }

    }
}
