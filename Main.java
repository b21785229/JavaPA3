import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//FileProcessor fp = new FileProcessor();
		ManageCustomers mng = new ManageCustomers();
		ManageOrders ord = new ManageOrders();
		Order o = new Order();
		//Constructor cons = InterfaceTopping.class.getConstructor(InterfaceTopping.class);
		String str = "Soudjouk";
		Pizza demoPizza = new Pizza(2);
		Customer neco = new Customer(21785229, "necos", "bahcelievler", "05558176227");
		mng.addCustomer(neco);
		
		demoPizza.addTopping((InterfaceTopping) Class.forName(str).newInstance());
		o.addPizza(demoPizza);
		ord.addOrder(o);
		ord.getAllOrders().get(0).pizzas.get(0).printToppings();


	}
	
}
