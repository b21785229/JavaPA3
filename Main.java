import java.lang.reflect.*;
import java.io.*;

public class Main {


	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
			FileProcessor fp = new FileProcessor();
			
			BufferedReader customer = new BufferedReader(new FileReader("customer.txt"));
			BufferedReader order = new BufferedReader(new FileReader("order.txt"));
			BufferedReader input = new BufferedReader(new FileReader("input.txt"));
			fp.processfile(input, customer, order);

		
		ManageCustomers mng = new ManageCustomers();
		ManageOrders ord = new ManageOrders();
		Order o = new Order();
		//Constructor cons = InterfaceTopping.class.getConstructor(InterfaceTopping.class);
		String str = ("Soudjouk");
		Pizza demoPizza = new Pizza(2);
		Customer neco = new Customer("21785229", "necos", "bahcelievler", "05558176227");
		mng.addCustomer(neco);
		
		//demoPizza.addTopping(new Salami(new Salami()));
		
		demoPizza.addTopping((InterfaceTopping) Class.forName("Salami").newInstance());

		o.addPizza(demoPizza);
		ord.addOrder(o);
		//ord.getAllOrders().get(0).pizzas.get(0).printToppings();

	}
	
	
}
