package ordertrackingsystem_lab;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private String orderNumber;
	private boolean prepaid;
	private double orderPrice;
	private Date orderDate;
	private String status;
	private ICustomer mCustomer;
	private ArrayList<Orderline> orderitems;
	
	Order(String onum, Date orderdate, String Status, ICustomer cus, ArrayList<Orderline> items) {
		this.orderNumber=onum;
		this.orderDate=orderdate;
		this.status=status;
		this.mCustomer=cus;
		this.orderitems=items;
		this.prepaid = false;
	}
	
	public double getTotalPrice() {
	double totalp=0;
	
	for(int i =0; i<orderitems.size();i++) {
		
		double tpr = orderitems.get(i).computePrice();
		
		totalp = totalp+tpr;
	}
	
	double cpoints = this.getCustomerPoints();
	if(cpoints >= 25) {
		
		totalp = totalp-(0.4*totalp);
		mCustomer.setCustomerPoints(-25);
		
	}
			
		return totalp;
	}
	
	public boolean getPrepaid() {
		String crating = mCustomer.getCreditRating();
		if(crating.equalsIgnoreCase("poor")) {
			prepaid = true;
		}
		else
		{
			prepaid =false;
		}
		
		double tcreditlimit = mCustomer.getCreditLimit();
		double oprice = this.getTotalPrice();
		if(oprice > tcreditlimit) {
			prepaid = true;
		}
		
		return prepaid;
	}
	
	public double getCustomerPoints() {
		
		return mCustomer.getCustomerPoints();
		
	}
	
	public double getOrderPoints() {
		
		double tpoints=0;
		
		for(int i =0; i<orderitems.size();i++) {
			
			double points = orderitems.get(i).computePoints();
			
			tpoints = tpoints+points;
		}
				
			return tpoints;
		
		
	}
	
	public void setCustomerPoints() {
		
		mCustomer.setCustomerPoints(this.getOrderPoints());
	}

}
