
public class HotPepper implements iPizza{

	public int price = 1;
	String title = " Hot Pepper added\n";
	HotPepper(){
		
	}
	
	HotPepper(iPizza ipizza){
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
