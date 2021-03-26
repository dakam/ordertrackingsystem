package ordertrackingsystem_lab;

import java.util.Date;

public class Orderline {
	private int quantity;
	private double price;
	private String status;
	private Date shipDate;
	private double points;
	private IProduct mproduct;
	
	Orderline(int quantity, Date shipdate, String status, IProduct mproduct) {
		this.quantity=quantity;
		this.shipDate=shipdate;
		this.status=status;
		this.mproduct=mproduct;
	}
	
	
	public double computePrice() {
		return mproduct.getPrice()*quantity;
	}
	
	public double computePoints() {
		
		return quantity*mproduct.getPoints();
	}

}
