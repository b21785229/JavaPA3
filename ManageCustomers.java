import java.util.*;

public class ManageCustomers implements CustomerDAO{
	
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<String> sortedNames = new ArrayList<String>();
	public Customer createCustomer(String ID, String Name, String Address, String Phone) {
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
	
	public Customer getById(String ID) {
		Customer cust = new Customer();
		for(Customer c: customerList) {
			if(c.getCustomerID().equals(ID)) {
				cust = c;
			}
		}
		return cust;
	}
	
	public Customer getByName(String name) {
		Customer cust = new Customer();
		for(Customer c: customerList) {
			if(c.getCustomerID().equals(name)) {
				cust = c;
			}
		}
		return cust;
	}
	
	public void sortByName(){
		for(Customer c: customerList) {
			sortedNames.add(c.getCustomerName());
			
		}  
	}
}
