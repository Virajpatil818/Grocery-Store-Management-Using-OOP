package java;
import java.util.*;
public class CustomerImpl {

	public void handle(GroceryStoreImpl store) {
Scanner input = new Scanner(System.in);
        
       
        System.out.println("Available products:");
        for (Product product : store.inventory) {
            System.out.println(product.getId() + ". " + product.getName() + " - $" + product.getPrice());
        }
        
        System.out.println("Enter the ID of the product you want to buy:");
        int productId = input.nextInt();
        
        Product product = store.getProduct(productId);
        if (product == null) {
            System.out.println("Product not available.");
        } else {
            System.out.println("Enter the quantity:");
            int quantity = input.nextInt();
            
            
            if (quantity > product.getStock()) {
                System.out.println("Insufficient stock.");
            } else {
                
                double totalPrice = quantity * product.getPrice();
                int rstock=product.getStock() - quantity;
                store.updateProduct(rstock,product.getId());
                
                System.out.println("Total price: $" + totalPrice);
            }
        }
		
	}

}
