package java;
import java.util.*;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        GroceryStoreImpl store = new GroceryStoreImpl();
        
        System.out.println("Welcome to the Grocery Store!");
        System.out.println("Are you a customer or an owner?");
        System.out.println("1. Customer");
        System.out.println("2. Owner");
        int choice = input.nextInt();
        
        switch(choice) {
            case 1:
                CustomerImpl customer = new CustomerImpl();
                customer.handle(store);
                break;
            case 2:
                OwnerImpl owner = new OwnerImpl();
                owner.handle(store);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        input.close();
    }
}
