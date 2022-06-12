import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Input people: ");
        int people = scanner.nextInt();

        System.out.printf("Money %.2f, people %d\n", amount, people);
        dividedAmounts(amount, people);

    }

    private static void dividedAmounts(double money, int people) {
        double portion = money / people;
        portion = Math.round(portion * 100.0) / 100.0;
        double checkNumber = money / people;

        List<Double> dividedMoney = new ArrayList<>();

        if (money % people != 0 && (portion * people) != money) {
            for (int i = 0; i < people - 1; i++) {
                dividedMoney.add(portion);
            }
            if (checkNumber < portion) {
                dividedMoney.add(portion - 0.01);
            } else {
                dividedMoney.add(portion + 0.01);
            }
            System.out.println("Entered dividing logic");

        } else {
            for (int i = 0; i < people; i++) {
                dividedMoney.add(portion);
            }
            System.out.println("Didn't enter dividing logic");
        }

        double sum = 0;
        for (Double amounts : dividedMoney) {
            System.out.printf("%.2f\n", amounts);
            sum = sum + amounts;
        }
        System.out.println("Divided sum is: ");
        System.out.println(sum);
        if (sum == money) {
            System.out.println("Everything is good");
        }


    }


}
