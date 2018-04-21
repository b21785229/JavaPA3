
public class Main {

	public static void main(String[] args) {
		ManageCustomers mng = new ManageCustomers();
		ManageOrders ord = new ManageOrders();
		Order o = new Order();
		Pizza demoPizza = new Pizza(2);
		Customer neco = new Customer();
		neco.setCustomerAddress("bahcelievler");
		neco.setCustomerID(21785229);
		neco.setCustomerName("necos");
		neco.setCustomerPhone("05558176227");
		mng.addCustomer(neco);
		System.out.println(mng.getAllCustomers().get(0).getCustomerID());
		
		demoPizza.addTopping(new Salami(new HotPepper(new Soudjouk(new Onion()))));
		o.addPizza(demoPizza);
		ord.addOrder(o);
		ord.getAllOrders().get(0).pizzas.get(0).printToppings();

	}
	
}