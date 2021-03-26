package ordertrackingsystem_lab;

public class CorporateCust extends ACustomer{
	
	private String Creditrating;
	private double Creditlimit;
	private double creditamount;

	CorporateCust(String name, String address, String crating, double climit, String ccnumber) {
		super(name, address,ccnumber);
		
		this.Creditlimit=climit;
		this.Creditrating=crating;
		
	}
	
	public double generateMonthlyBill() {
		return creditamount;
	}

	@Override
	public String getCreditRating() {
		// TODO Auto-generated method stub
		return Creditrating;
	}
	
	public void setOrderCredit(double cred) {
		creditamount = creditamount+cred;	
	}
	@Override
	public double getCreditLimit() {
		return Creditlimit;
	}

}
