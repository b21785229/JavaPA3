
public class HotPepper implements iPizza{

	public int price;
	String title;
	//public boolean isUsed = false;
	HotPepper(boolean isUsed){
		if(isUsed) {
			price = 1;
			title = " Hot Pepper added\n";
		}
		else {
			price = 0;
			title = "";
		}
	}
	
	HotPepper(iPizza ipizza, boolean isUsed){
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
