package bouquetPackage;

import java.util.HashMap;
import java.util.Map;

public class ImplementationclassForBouque {

	public static void main(String[] args) {
		
		Map<String, Integer> flowerTypeNumber = new HashMap<>();
		flowerTypeNumber.put("Rose", 10);
		flowerTypeNumber.put("Jasmine", 20);
		flowerTypeNumber.put("Lily", 30);
		flowerTypeNumber.put("Sunflower", 10);
		
		
		Bouque bo = new BouqueOfChoice(flowerTypeNumber, "BirthdayBouque");
		
		int costOfBouque = bo.costOfBouque(flowerTypePriceInventory.flowerTypePrice, flowerTypeNumber);
		String nameOfBouque = bo.getBouqueName();
		System.out.println("Cost of " + nameOfBouque + " is "
															+ costOfBouque 
															+ " having those flower which are in inventory");

	}

}
