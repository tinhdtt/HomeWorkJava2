import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberDayOfMonth num = new NumberDayOfMonth();
        QuadraticEquation qe = new QuadraticEquation();
        CheckTriangle check = new CheckTriangle();
        NumberDayOfMonthUseIf numif = new NumberDayOfMonthUseIf();
        Main m = new Main();
        m.Menu();

        int option;
        System.out.println("Select option: ");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        while (option != 5) {
            switch (option) {
                case 1:
                    num.NumberDay();
                    break;
                case 2:
                    qe.QE();
                    break;
                case 3:
                    check.Check();
                    break;
                case 4:
                    numif.NumberDay();
                    break;
            }
//            m.Menu();
            System.out.println("Select option: ");
            option = sc.nextInt();
        }
    }

    void Menu() {
        System.out.println("===================");
        System.out.println("==Please select an option==");
        System.out.println("==1. Number day of the month==");
        System.out.println("==2. Quadratic Equation==");
        System.out.println("==3. Check Triangle==");
        System.out.println("==4. Number day of the month (Use If)==");
        System.out.println("==5. Quit");
        System.out.println("===================");
    }
}
