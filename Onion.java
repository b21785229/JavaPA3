public class Onion implements InterfaceTopping {

	public int price = 2;
	public String title = " Onion added\n";
	//public boolean isUsed = false;

	Onion(){
		
	}
	
	Onion(InterfaceTopping ipizza, boolean isUsed){
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
