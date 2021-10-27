package bootCampNewJoinee;

public class BouquetMainClass {

	public static void main(String[] args) {
		
		BouquetAbstarctClass BouquetParty=BouquetFactory.getBouquetType("BouquetParty", 10, 20, 30);
		
		BouquetAbstarctClass BouquetBirthday=BouquetFactory.getBouquetType("BouquetBirthday", 10, 50,0);
		
		BouquetAbstarctClass BouquetFacilitation=BouquetFactory.getBouquetType("BouquetFacilitation", 0, 0, 100);
		
		System.out.println("BouquetParty cost "+ BouquetParty.cost());
		
		System.out.println("BouquetBirthday cost "+ BouquetBirthday.cost());
		
		System.out.println("BouquetFacilitation cost "+ BouquetFacilitation.cost());
		

	}

}
