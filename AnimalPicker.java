import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";

        while (true) {
            System.out.println("Would you like to see a dog or cat or fish?");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("dog")) {
                System.out.println("  __    __");
                System.out.println("o-''))_____\\\\");
                System.out.println("\"--__/ * * * )");
                System.out.println("c_c__/-c____/");
                break;  
            }
            else if (choice.equalsIgnoreCase("cat")) {
                System.out.println(" /\\_/\\");
                System.out.println("( o.o )");
                System.out.println(" > ^ <");
                break;  
            }
            else if (choice.equalsIgnoreCase("fish")) {
                System.out.println("               O  o");
                System.out.println("          _\\_   o");
                System.out.println(">('>   \\\\/  o\\ .");
                System.out.println("       //\\\\___=");
                System.out.println("          ''");
                break;
            }
            else {
                System.out.println("Error: Invalid option. Please enter dog, cat, or fish.");
            }
        }

        scanner.close();
    }
}