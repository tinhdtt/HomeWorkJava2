import java.util.Scanner;

public class NumberDayOfMonthUseIf {
    int month;
    void NumberDay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Month = ");
        month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12) {
            System.out.println("There are 31 days in month " +month);
        }
        else if (month == 2) {
            System.out.println("There are 28 or 29 days in February");
        }
        else if (month == 3 || month == 5 || month == 9 || month == 11) {
            System.out.println("There are 30 days in month " +month);
        }
        else {
            System.out.println("Please input month from 1 to 12");
        }

    }
}
