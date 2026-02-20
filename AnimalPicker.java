import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to see a dog or cat?");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("dog")) {
            System.err.println("DOG ASCII ART HERE");
        }
        else if (choice.equalsIgnoreCase("cat")) {
            System.err.println("CAT ASCII ART HERE");
        }
    }
}
