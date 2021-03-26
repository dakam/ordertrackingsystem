package ordertrackingsystem_lab;

import java.util.ArrayList;
import java.util.Date;

public class MainApplication {

	public static void main(String[] args) {
	
		ICustomer DamianKato = new CorporateCust("Damian Kato", "52557 IA","excellent", 500, "600-500-000");
		ICustomer JamesDoe = new CorporateCust("James Doe", "52557 IA","good", 200, "782-500-000");
		ICustomer moseskays = new CorporateCust("Moses Kays", "52557 IA","poor", 500, "090-500-000");
		
		
		ICustomer JaneDane = new PersonalCust("Jane Dane", "52557", "6277-99999");
		ICustomer SarahJay = new PersonalCust("Sarah Jay", "52557", "68119-999");
		ICustomer Sabsmark = new PersonalCust("Mark Sabs", "52557", "000-0091");
		
		ICompPoints comp = new ComputerPoints();
		ICompPoints medics = new HealthPoints();
		ICompPoints audo_video = new Audio_VideoPoints();
		ICompPoints others = new OtherPoints();
		
		IProduct laptop = new Product("Laptop Lenovo", "82998", 170, comp );
		IProduct bag = new Product("Black Hand Bag", "8192", 20, others );
		IProduct netflixmovie = new Product("Coming to america movie", "99992", 10, audo_video );
		IProduct headsets = new Product("Bass gears", "7772", 15, audo_video );
		IProduct dress = new Product("jdress", "221", 22, others );
		
		
		Orderline cartitem1= new Orderline(3, null, "ordered",laptop );
		Orderline cartitem2= new Orderline(2, null, "ordered",bag );
		Orderline cartitem3= new Orderline(10, null, "ordered",netflixmovie );
		
		ArrayList<Orderline> mycart1 = new ArrayList<Orderline>();
		mycart1.add(cartitem1);
		mycart1.add(cartitem2);
		mycart1.add(cartitem3);
		
		Orderline cartitem4= new Orderline(2, null, "ordered",laptop );
		Orderline cartitem5= new Orderline(15, null, "ordered",bag );
		
		ArrayList<Orderline> mycart2 = new ArrayList<Orderline>();
		mycart2.add(cartitem4);
		mycart2.add(cartitem5);
		
		
		Order order1 = new Order("OR01", null, "placed", DamianKato, mycart1);
		
		double tprice1 = order1.getTotalPrice();
		double tpoints1 = order1.getOrderPoints();
		double points1 = order1.getCustomerPoints();
		
		System.out.println("*** ORDER TRACKING SYSTEM*****");
		System.out.println("Order By "+DamianKato.getName());
		System.out.println("Order points= "+tpoints1);
		System.out.println("Total Order Price= "+tprice1);
		System.out.println("Customer Points before pressing order= "+points1);
		order1.setCustomerPoints();
		System.out.println("Customer Points before pressing order= "+order1.getCustomerPoints());
		System.out.println("Is this prepaid transaction= "+order1.getPrepaid());
		System.out.println("********");
		
		
		
		
		
		
		
		Order order2 = new Order("OR02", null, "placed", JaneDane, mycart2);
		
		
		double tprice2 = order2.getTotalPrice();
		double tpoints2 = order2.getOrderPoints();
		double points2 = order1.getCustomerPoints();
		
		System.out.println("*** ORDER TRACKING SYSTEM*****");
		System.out.println("Order By "+JaneDane.getName());
		System.out.println("Order points= "+tpoints2);
		System.out.println("Total Order Price= "+tprice2);
		System.out.println("Customer Points before pressing order= "+points2);
		System.out.println("Customer Points before pressing order= "+order2.getCustomerPoints());
		order2.setCustomerPoints();
		System.out.println("Customer Points After pressing order= "+order2.getCustomerPoints());
		System.out.println("Is this prepaid transaction= "+order2.getPrepaid());
		System.out.println("********");
		
		
		
		
		
		
		
	}

}
