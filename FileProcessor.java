public class FileProcessor {
	
	String line = new String("sucuk");
	boolean sucuk = false;
	boolean biber = false;
	boolean sogan = true;
	boolean sosis = false;
	
public void processfile() {
	if(line.equals("sucuk")) {
		//sucuk = true;
		System.out.println("//////////");
		}
	Pizza pizza = new Pizza(1);
	pizza.addTopping(new Salami(new Soudjouk(new HotPepper(new Onion()))));
	pizza.printToppings();
}
}
