package method;

import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeap(year)) days[1] = 29;

        int firstDay = getFirstDay(month, year);
        System.out.println("Calendar for " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int d = 1; d <= days[month-1]; d++) {
            System.out.printf("%3d ", d);
            if ((firstDay + d) % 7 == 0) System.out.println();
        }
    }

    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getFirstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + (31*m0)/12) % 7;
    }
}