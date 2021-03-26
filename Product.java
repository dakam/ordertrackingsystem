package ordertrackingsystem_lab;

public class Product implements IProduct{
	private String description;
	private String productNumber;
	private double price;
	private ICompPoints compPoints;
	
	Product(String description, String productNumber, double price, ICompPoints comp ) {
		this.description=description;
		this.productNumber=productNumber;
		this.price=price;
		this.compPoints=comp;
	}
	
	public double getPoints() {
		return compPoints.getPoints();
	}
	@Override
	public double getPrice() {
		
		return price;
	}
	
	

}
