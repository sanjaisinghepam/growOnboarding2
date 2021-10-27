package bootCampNewJoinee;

public class BouquetFactory {
	
	public static BouquetAbstarctClass getBouquetType(String typeOfBouquet ,int roses, int jasmines, int lilys) 
	{
		if(typeOfBouquet.equalsIgnoreCase("BouquetParty")) 
		{
			return new BouquetParty(roses,jasmines,lilys);
		}
		
		else if(typeOfBouquet.equalsIgnoreCase("BouquetBirthday")) 
		{
			return new BouquetParty(roses,jasmines,lilys);
		}
		
		else if(typeOfBouquet.equalsIgnoreCase("BouquetFacilitation")) 
		{
			return new BouquetParty(roses,jasmines,lilys);
		}
		
		return null;
		
	}

}
