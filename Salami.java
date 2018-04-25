
public class Salami implements InterfaceTopping{

	public int price = 3;
	public String title = " Salami added\n";
	//public boolean isUsed = false;
	
	Salami(){
		
	}
	
	Salami(InterfaceTopping ipizza){
		price += ipizza.getPrice();
		title = ipizza.getTitle() + title;

	}
	
	Salami(InterfaceTopping ipizza, boolean isUsed){
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
