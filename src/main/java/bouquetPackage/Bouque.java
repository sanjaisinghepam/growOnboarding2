package bouquetPackage;

import java.util.Map;
import java.util.Set;

public abstract class Bouque {
	
	public abstract Map<String, Integer> getFlowerTypeNumber();
	
	public abstract String getBouqueName();
	
	public int costOfBouque(Map<String, Integer> flowerTypePrice , Map<String, Integer> flowerTypeNumber) 
	{
		int cost = 0;
		
		Set<String> flowerType = flowerTypeNumber.keySet();
		
		for(String flowerName : flowerType) 
		{
			if(flowerTypePrice.containsKey(flowerName))
				cost = cost + flowerTypePrice.get(flowerName)*flowerTypeNumber.get(flowerName);
			else
				System.out.println(flowerName + " flower currently not in inventory");
		}
		
		return cost;
		
	}

}
