import java.util.Scanner;

public class NumberDayOfMonth {
    int month;

    void NumberDay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Month = ");
        month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("There are 31 days in January");
                break;
            case 2:
                System.out.println("There are 28 or 29 days in February");
                break;
            case 3:
                System.out.println("There are 31 days in March");
                break;
            case 4:
                System.out.println("There are 30 days in April");
                break;
            case 5:
                System.out.println("There are 31 days in May");
                break;
            case 6:
                System.out.println("There are 30 days in June");
                break;
            case 7:
                System.out.println("There are 31 days in July");
                break;
            case 8:
                System.out.println("There are 31 days in August");
                break;
            case 9:
                System.out.println("There are 30 days in September");
                break;
            case 10:
                System.out.println("There are 31 days in October");
                break;
            case 11:
                System.out.println("There are 30 days in November");
                break;
            case 12:
                System.out.println("There are 31 days in December");
                break;
            default:
                System.out.println("Please input month from 1 to 12");
                break;
        }
    }
}
