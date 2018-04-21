public class Onion implements iPizza {

	public int price = 2;
	public String title = " Onion added\n";
	
	
	Onion(){
		
	}
	
	Onion(iPizza ipizza){
		price += ipizza.getPrice();
		title = ipizza.getTitle() + title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getTitle() {
		return title;
	}
	
}
