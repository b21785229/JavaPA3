
public class Soudjouk implements iPizza{
	
	public int price = 3;
	String title = " Soudjouk added\n";
	Soudjouk(){
	}
	
	Soudjouk(iPizza ipizza){
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
