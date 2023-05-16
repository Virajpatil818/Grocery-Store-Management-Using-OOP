package java;
import java.util.*;

public class GroceryStoreImpl {
	 public List<Product> inventory;
	 
	 public GroceryStoreImpl() {
	        inventory = new ArrayList<>();
	    }
	    
	    public void addProduct(Product product) {
	        inventory.add(product);
	    }
	    
	    public void removeProduct(int productId) {
	        for (int i = 0; i < inventory.size(); i++) {
	            if (inventory.get(i).getId() == productId) {
	                inventory.remove(i);
	                break;
	            }
	        }
	    }
	  
	    public void checkout(List<Product> cart) {
	        double totalCost = 0;
	        for (Product product : cart) {
	            totalCost += product.getPrice();
	        }
	        System.out.println("Here is your receipt:");
            for (Product product : cart) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
            System.out.println("Total: $" + totalCost);
	    }
	    public Product getProduct(int productId) {
	    	for (int i = 0; i < inventory.size(); i++) {
	            if (inventory.get(i).getId() == productId) {
	                return inventory.get(i);
	            }
	            
	        }
	    	return null;
	    }
	    
	    public void updateProduct(int rstock,int id) {
	    	for (int i = 0; i < inventory.size(); i++) {
	    		if (inventory.get(i).getId() == id) {
	    			inventory.get(i).setStock(rstock);
	    		}
	    	}
	    }
	 
}
