import java.util.*;

public interface CustomerDAO {
	
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer, String Address);
	public void removeCustomer(Customer customer);
	public ArrayList<Customer> getAllCustomers();
}
