import java.util.*;

public class ManageCustomers implements CustomerDAO{
	
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public Customer createCustomer(int ID, String Name, String Address, String Phone) {
		return new Customer(ID, Name, Address, Phone);
		
		
	}
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	public void updateCustomer(Customer customer, String Address) {
		customer.setCustomerAddress(Address);
	}
	
	public void removeCustomer(Customer customer) {
		customerList.remove(customer);
	}
	
	public ArrayList<Customer> getAllCustomers(){
		return customerList;
	}
	
}
