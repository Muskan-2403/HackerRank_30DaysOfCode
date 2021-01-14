package Code;

import java.util.Scanner;

public class Day_2_Operators {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = ((double)tip_percent*meal_cost)/100;
        double tax= ((double)tax_percent*meal_cost)/100;
        double total = meal_cost+tip+tax;
        System.out.println((int)Math.round(total));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
