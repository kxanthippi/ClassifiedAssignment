
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class User extends Classifieds{

    public User() {
    }

    public User(int id, String city, double price, int availability, int area) {
        super(id, city, price, availability, area);
    }

    
    public void register() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String username = sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        System.out.println(password == "*********");

        System.out.println("Confirm Password: ");
        String confPassword = sc.nextLine();
        
        

        String x = username + " " + password;
        if (password.equals(confPassword)) {

            File f = new File("statusUser.txt");
            Scanner content = new Scanner(f);

            int flag = 0;
            while (content.hasNextLine()) {
                String data = content.nextLine();
                if (data.equals(x)) {
                    System.out.println("Already Registered");
                    flag = 1;
                    System.out.println("1. Registration. ");
                    System.out.println("2. Login. ");
                    System.out.println("Enter your Choice");
                    
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        this.register();
                    } else if (choice == 2) {
                        this.login();
                    } else {
                        System.out.println("Choose Proper Option");
                    }
                    break;
                }
                content.close();
            }
            if (flag == 0) {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("statusUser.txt", true));
                    out.write(username + " " + password + "\n");
                    out.close();
                } catch (IOException e) {
                    System.out.println("exception occured" + e);
                }

                System.out.println("Successfully Registered");
                System.out.println("Please login");
                this.login();
            }

        } else {
            System.out.println("Recheck");
            System.out.println("1. Registration. ");
            System.out.println("2. Login. ");
            System.out.println("Enter your Choice");
            
            int choice = sc.nextInt();
            if (choice == 1) {
                this.register();
            } else if (choice == 2) {
                this.login();
            } else {
                System.out.println("Choose Proper Option");
            }
        }
        sc.close();
    }

    public void login() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String username = sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        System.out.println(password == "*********");

        
        String x = username + " " + password;

        try {

            File f = new File("statusUser.txt");
            Scanner content = new Scanner(f);
            int flag = 0;
            while (content.hasNextLine()) {
                String data = content.nextLine();
                if (data.equals(x)) {
                    System.out.println("Login Successful");
                    System.out.println("Welcome to the Application.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Login Failed");
                System.out.println("1. Registration. ");
                System.out.println("2. Login. ");

                System.out.println("Enter your Choice");
                int choice = sc.nextInt();
                if (choice == 1) {
                    this.register();
                } else if (choice == 2) {
                    this.login();
                } else {
                    System.out.println("Choose Proper Option");
                }
            }

            content.close();
        } catch (FileNotFoundException e) {

            System.out.println("Error.");
            e.printStackTrace();
        }

        sc.close();

    }
}




