import java.util.Scanner;

public class IT24102937Lab5Q3 { 
    public static void main(String[] args) {
               final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_RATE_3_TO_4_DAYS = 10; 
        final int DISCOUNT_RATE_5_OR_MORE_DAYS = 20; 
               Scanner scanner = new Scanner(System.in);

              System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; 
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            return;         }

              int numberOfDays = endDate - startDate;

                double discount = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discount = DISCOUNT_RATE_3_TO_4_DAYS;
        } else if (numberOfDays >= 5) {
            discount = DISCOUNT_RATE_5_OR_MORE_DAYS;
        }

               double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * discount / 100;
        double amountToPay = totalAmount - discountAmount;

                System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Discount applied: " + discount + "%");
        System.out.printf("Total amount to be paid: Rs %.2f\n", amountToPay);

                scanner.close();
    }
}
