
public class Soudjouk implements iPizza{
	
	public int price = 3;
	String title = " Soudjouk added\n";
	//public boolean isUsed = false;

	Soudjouk(){
		
	}
	
	Soudjouk(iPizza ipizza, boolean isUsed){
		//this.isUsed = isUsed;
		if(isUsed) {
		price += ipizza.getPrice();
		title = ipizza.getTitle() + title;
		}
		else {
			price = ipizza.getPrice();
			title = ipizza.getTitle();
		}
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getTitle() {
		return title;
	}
		
}
