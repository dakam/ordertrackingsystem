package ordertrackingsystem_lab;

public interface ICustomer {

	public String getCreditRating();
	public void setCustomerPoints(double points);
	public double getCustomerPoints();
	public double getCreditLimit();
	public String getName();
}
