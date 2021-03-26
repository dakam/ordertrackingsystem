package ordertrackingsystem_lab;

public class PersonalCust extends ACustomer{
	
	private String Creditrating;
	

	PersonalCust(String name, String address, String ccnumber) {
		super(name, address,ccnumber);
		
		this.Creditrating="poor";
		
	}

	@Override
	public String getCreditRating() {
	
		return Creditrating;
	}

}
