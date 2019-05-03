public class InterestCalculator {
  public static void main(String[] args) {
    double principal = 1.0;
    int month = 1;
    double interest_rate = 1.0;
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Money: ");
    principal = input.nextDouble();
    double money = principal;
    System.out.println("Time (month): ");
    month = input.nextInt();
    System.out.println("Interest rate: ");
    interest_rate = input.nextDouble();
    double total_interest = 0;
    for (int i = 0; i < month; i++) {
      money += money * (interest_rate / 100) / 12;
    }
    total_interest = money - principal;
    System.out.println("Total interest: " + total_interest);
  }
}
