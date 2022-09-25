import java.util.Scanner;

public class algorithim {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("How many minutes did you call for? ");
    int totalMins = scan.nextInt();
    scan.close();

    float connectionFee = 1.99f;
    int firstThreeMins = 2;
    float addMin = 0.45f;

    if (totalMins < 3) {
      System.out.println(connectionFee);
    }

    else if (totalMins == 3) {
      System.out.println(connectionFee + firstThreeMins);
    }

    else if (totalMins > 3) {
      int additionalAmount = totalMins - 3;
      float totalAmountRemaining = additionalAmount * addMin;
      float totalLarger3 = connectionFee + firstThreeMins + totalAmountRemaining;

      System.out.println(totalLarger3);
    }
  }
}