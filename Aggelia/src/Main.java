
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Classifieds class1 = new Classifieds();
        class1.attributes();

        try {

            File obj = new File("statusUser.txt");

            if (obj.createNewFile()) {
                System.out.println("File is created");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Registration. ");
        System.out.println("2. Login. ");

        System.out.println("Enter your Choice");
        choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            User user = new User();
            user.register();

        } else if (choice == 2) {
            User user = new User();
            user.login();
            user.attributes();
        } else {
            System.out.println("Choose Proper Option");
        }
        sc.close();

    }

}
