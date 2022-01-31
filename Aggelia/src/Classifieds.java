
import java.util.Scanner;
import java.util.*;

public class Classifieds {

    int id;
    String city;
    double price;
    int availability;
    int acreage;

    //Default Constructor
    public Classifieds() {
    }

    //Constructor
    public Classifieds(int id, String city, double price, int availability, int area) {
        this.id = id;
        this.city = city;
        this.price = price;
        this.availability = availability;
        this.acreage = acreage;
    }

//    We will create the list based on the id of each classified
//    ArrayList objlist = new ArrayList();
//    Objectlist takes only objects, so if we want to take Integer, we have to do casting
//    Integer ii = (Integer) objlist.get(0);
    

    //Methods
    void attributes() {

        Scanner sc1 = new Scanner(System.in);

        //City
        while (true) {
            System.out.println("Enter city: ");
            city = sc1.nextLine();

            if (city.equals("Athens") || city.equals("Thessaloniki") || city.equals("Patra") || city.equals("Hrakleio")) {
                System.out.println(" The city is " + city);
                break;
            } else {
                System.out.println("Try again.");
            }
        }

        //Price
        while (true) {
            System.out.println("Enter price: ");
            price = sc1.nextInt();

            if (price > 50 && price <= 5000000) {
                System.out.println("OK");
                break;
            } else {
                System.out.println("Please give other price.");
            }
        }

        //Acreage
        while (true) {
            System.out.println("Enter acreage: ");
            acreage = sc1.nextInt();

            if (acreage > 20 && acreage <= 1000) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Please give other acreage.");
            }
        }

        //Availabilty
        System.out.println("Select 1. for Rent 2. Sale");
        availability = sc1.nextInt();

        switch (availability) {
            case 1:
                System.out.println("Rent");
                break;
            case 2:
                System.out.println("Sale");
                break;
        }

    }
    /*
    void deleteItemsFromList() {

        //Through interator we will delete many things from list  
        //eg If the user want to add a classified which is exists, we will delete the duplicates
        Iterator<String> it = objlist.iterator();
        it = objlist.iterator();

        while (it.hasNext()) { // υπάρχει επόμενο;;
            System.out.println(it.next()); // δώσε μου το επόμενο
        }
    }
     */

}
