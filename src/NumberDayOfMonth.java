import java.util.Scanner;

public class NumberDayOfMonth {
    int month;

    void NumberDay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Month = ");
        month = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in month " +month);
                break;
            case 2:
                System.out.println("There are 28 or 29 days in February");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days in month " +month);
                break;
            default:
                System.out.println("Please input month from 1 to 12");
                break;
        }
    }
}
