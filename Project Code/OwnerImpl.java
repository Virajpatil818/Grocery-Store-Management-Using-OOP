package java;
import java.util.*;
public class OwnerImpl {

	public void handle(GroceryStoreImpl store) {
		Scanner input = new Scanner(System.in);
	    // Display the list of available products
	    System.out.println("Current inventory:");
	    for (Product product : store.inventory) {
	        System.out.println(product.getId() + ". " + product.getName() + " - $" + product.getPrice());
	    }
	    System.out.println("Choose an action:");
	    System.out.println("1. Add product");
	    System.out.println("2. Remove product");
	    int choice = input.nextInt();
	    
	    switch(choice) {
        case 1:
            
            System.out.println("Enter the product ID:");
            int id = input.nextInt();
            input.nextLine();
            System.out.println("Enter the product name:");
            String name = input.nextLine();
            System.out.println("Enter the product price:");
            double price = input.nextDouble();
             System.out.println("Enter the product stock:");
            int stock = input.nextInt();
            
            
            Product product = new Product(id, name, price,stock);
            store.addProduct(product);
            System.out.println("Product added successfully.");
            break;
        case 2:
            
            System.out.println("Enter the ID of the product to remove:");
            int productId = input.nextInt();
            
            store.removeProduct(productId);
            System.out.println("Product removed successfully.");
            break;
        
            }
	    
	    
	    
	}

}
