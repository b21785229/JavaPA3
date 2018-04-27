import java.io.*;
import java.lang.reflect.*;

public class FileProcessor {

public void processfile(BufferedReader input, BufferedReader customer, BufferedReader order) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
	ManageCustomers mngCust = new ManageCustomers();
	ManageOrders mngOrd = new ManageOrders();
	int wordCount;
	int a;
	Pizza pizza;
	String orderid = new String();
	String ordercust = new String();
	int ordernum = -1;
	String[] splittedstring;
	String line = new String();
	String customerID = new String();
	String customerName = new String();
	String customerPhone = new String();
	String customerAddress = new String();
	while ((line = customer.readLine()) != null) {
		wordCount = 0;
		for(String retval: line.split(" ")) {
			if(wordCount == 0) {
				customerID = retval;
			}
			else if(wordCount == 1) {
				retval = retval + " ";
				customerName = retval;
			}
			else if(wordCount == 2) {
				customerName = customerName + retval; 
			}
			else if(wordCount == 3){
				customerPhone = retval;
			}
			else if(wordCount == 5) {
				customerAddress = retval;
			}
			else if(wordCount>5){
				customerAddress += " " + retval;
			}
			wordCount++;
		}
		mngCust.addCustomer(new Customer(customerID, customerName, customerPhone, customerAddress));
		System.out.println(line);

	}
	
	while ((line = order.readLine()) != null) {
		splittedstring = line.split(" ");
		if(splittedstring[0].equals("Order:")) {
			ordernum++;
			orderid = splittedstring[1];
			ordercust = splittedstring[2];
			mngOrd.addOrder(new Order(orderid, ordercust));
		}
		if(splittedstring[0].equals("AmericanPan")) {
			pizza = new Pizza(1);
			for(a = 1; a < splittedstring.length; a++) {
				if(a<=3) {
				pizza.addTopping((InterfaceTopping) Class.forName(splittedstring[a]).newInstance());
				}
			}
		mngOrd.getAllOrders().get(ordernum).addPizza(pizza);
		}
		if(splittedstring[0].equals("NapolitanPan")) {
			pizza = new Pizza(2);
			for(a = 1; a < splittedstring.length; a++) {
				if(a<=3) {
				pizza.addTopping((InterfaceTopping) Class.forName(splittedstring[a]).newInstance());
				}
				if(a == 4) {
					System.out.println("Maximum 3 toppings can be added!");
				}
			}
			mngOrd.getAllOrders().get(ordernum).addPizza(pizza);
		}
		if(splittedstring[0].equals("softdrink")) {
			mngOrd.getAllOrders().get(ordernum).addDrink();
		}
		
	}
	
	
	
	// READING THE INPUT FILE:
	
	while ((line = input.readLine()) != null) {
		//System.out.println(line);
		splittedstring = line.split(" ");
		if(splittedstring[0].equals("AddCustomer")) {
			customerID = splittedstring[1];
			customerName = splittedstring[2] + splittedstring[3];
			customerPhone = splittedstring[4];
			for(a = 5; a < splittedstring.length; a++) {
				if(a == 5) {
					customerAddress = splittedstring[a];
				}
				else {
					customerAddress = " " + splittedstring[a];
				}
			}
			mngCust.addCustomer(new Customer(customerID, customerName, customerPhone, customerAddress));
			System.out.println("Customer added " + customerID + " " + customerName);
		}
		if(splittedstring[0].equals("RemoveCustomer")) {
			System.out.println("Customer " + mngCust.getById(splittedstring[1]).getCustomerID() + " " + mngCust.getById(splittedstring[1]).getCustomerName() + " removed");
			mngCust.removeCustomer(mngCust.getById(splittedstring[1]));
			}
		if(splittedstring[0].equals("CreateOrder")) {
			mngOrd.addOrder(new Order(splittedstring[1], splittedstring[2]));
			System.out.println("Order " + splittedstring[1] + " created");

			}
		if(splittedstring[0].equals("AddPizza")) {
			if(splittedstring[2].equals("AmericanPan")) {
			pizza = new Pizza(1);
			for(a = 3; a < splittedstring.length; a++) {
				if(a<=6) {
				pizza.addTopping((InterfaceTopping) Class.forName(splittedstring[a]).newInstance());
				}
				}
				mngOrd.getById(splittedstring[1]).addPizza(pizza);
			}
			if(splittedstring[2].equals("NapolitanPan")) {
				pizza = new Pizza(2);
				for(a = 3; a < splittedstring.length; a++) {
					if(a<=6) {
					pizza.addTopping((InterfaceTopping) Class.forName(splittedstring[a]).newInstance());
					}
					}
					mngOrd.getById(splittedstring[1]).addPizza(pizza);
				}
			
		}
		if(splittedstring[0].equals("AddDrink")) {
			mngOrd.getById(splittedstring[1]).addDrink();
			System.out.println("Drink added to order " + splittedstring[1]);
			}
		if(splittedstring[0].equals("PayCheck")) {
			System.out.println("Paycheck for order " + splittedstring[1]);
			for(Pizza p : mngOrd.getById(splittedstring[1]).pizzas) {
				p.printToppings();
			}
			if(mngOrd.getById(splittedstring[1]).getDrinks()>0) {
				System.out.println("\tSoft Drink: $" + mngOrd.getById(splittedstring[1]).getDrinks());}
			System.out.println("\tTotal: $" + mngOrd.getById(splittedstring[1]).getPrice());
			
		}
		if(splittedstring[0].equals("List")) {
			mngCust.sortByName();
			for(String st : mngCust.sortedNames) {
				
				System.out.println(st);
				//System.out.println(mngCust.getByName(st).getCustomerID() + " " + mngCust.getByName(st).getCustomerName() + " " + mngCust.getByName(st).getCustomerPhone());
			}
		}
}	
}
}
