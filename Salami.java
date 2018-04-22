
public class Salami implements iPizza{

	public int price = 3;
	public String title = " Salami added\n";
	//public boolean isUsed = false;
	
	Salami(){
		
	}
	
	Salami(iPizza ipizza, boolean isUsed){
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
