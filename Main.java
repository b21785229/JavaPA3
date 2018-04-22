
public class Main {

	public static void main(String[] args) {
		//FileProcessor fp = new FileProcessor();
		ManageCustomers mng = new ManageCustomers();
		ManageOrders ord = new ManageOrders();
		Order o = new Order();
		Pizza demoPizza = new Pizza(2);
		Customer neco = new Customer(21785229, "necos", "bahcelievler", "05558176227");
		mng.addCustomer(neco);
		//System.out.println(mng.getAllCustomers().get(0).getCustomerID());
		
		demoPizza.addTopping(new Salami(new Soudjouk(new Onion(new HotPepper(false), true), false), false), false);
		o.addPizza(demoPizza);
		ord.addOrder(o);
		ord.getAllOrders().get(0).pizzas.get(0).printToppings();


	}
	
}
