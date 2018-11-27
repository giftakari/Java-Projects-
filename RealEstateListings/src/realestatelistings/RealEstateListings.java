package realestatelistings;

public class RealEstateListings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties land = new Properties(10000,"Land",2.1);
		Properties estate = new Properties(250000,"Estate",1.5,3,4);
		System.out.println(land.toString());
		System.out.println(estate.toString());
		estate.setAskingPrice(230000);
		System.out.println(estate.toString());

	}

}
