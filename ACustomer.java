package ordertrackingsystem_lab;

public abstract class ACustomer implements ICustomer{

	private String name;
	private String address;
	private double points;
	private String Creditcardnumber;
	private double creditLimit;
	
	ACustomer(String name, String address, String ccnumber) {
	this.name =name;
	this.address=address;
	this.points=0;
	this.Creditcardnumber=ccnumber;
	
	}
	
	public abstract String getCreditRating();
	
	public void setCustomerPoints(double points) {
		this.points = this.points+points;
	}
	
	public double getCustomerPoints() {
		return points;
	}
	public String getName() {
		return name;
	}
	
	public double getCreditLimit() {
		return 0;
	}

}
