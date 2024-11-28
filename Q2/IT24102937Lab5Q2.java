import java.util.Scanner;

public class IT24102937Lab5Q2 { 
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        
        
        int newMembers;
        
        
        while (true) {
            System.out.print("Enter the number of new members introduced by the customer: ");
            newMembers = scanner.nextInt();
            
            
            if (newMembers >= 0) {
                break;             } else {
                System.out.println("Invalid input. The number of new members should be greater than or equal to 0.");
            }
        }
        
                String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                if (newMembers >= 5) {
                    prize = "Headphone";
                } else {
                    prize = "No Prize";                 }
        }
        
              System.out.println("The customer is entitled to: " + prize);
        
                scanner.close();
    }
}
