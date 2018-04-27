import java.util.*;

public interface CustomerDAO {

	public void addCustomer(Customer customer);

	public void updateCustomer(Customer customer, String Address);

	public void removeCustomer(Customer customer);

	public Customer getById(String ID);

	public ArrayList<Customer> getAllCustomers();

	public Customer getByName(String name);

	public void sortByName();

	public void sortByID();

}
