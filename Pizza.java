
public class Pizza{
	public int price;
	public String title;
	
	public Pizza(int pan){
		if(pan == 1) {
			title = "AmericanPan pizza\n";
			price = 5;}
		
		if(pan == 2){
			title = "NeapolitanPan pizza\n";
			price = 10;}	
	}
	public void addTopping(iPizza decoredPizza, boolean isUsed){
		if(isUsed) {
		price += decoredPizza.getPrice();
		title = decoredPizza.getTitle() + title;
		}
	
		return;
	}
	public int cost() {
		return price;
		}
	
	public void printToppings() {
		System.out.println(title  +" price: " + cost() + "$\n");
		return;
		}
}
