import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";

        while (true) {
            System.out.println("Would you like to see a dog or cat?");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("dog")) {
                System.out.println("DOG ASCII ART HERE");
                break;  
            }
            else if (choice.equalsIgnoreCase("cat")) {
                System.out.println("CAT ASCII ART HERE");
                break;  
            }
            else {
                System.out.println("Error: Invalid option. Please enter 'dog' or 'cat'.");
            }
        }

        scanner.close();
    }
}