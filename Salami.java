
public class Salami implements iPizza{

	public int price = 3;
	public String title = " Salami added\n";
	
	
	Salami(){
		
	}
	
	Salami(iPizza ipizza, boolean isUsed){
		if(isUsed) {
		price += ipizza.getPrice();
		title = ipizza.getTitle() + title;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getTitle() {
		return title;
	}
		
}
