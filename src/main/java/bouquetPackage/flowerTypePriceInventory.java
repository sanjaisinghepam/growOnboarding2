package bouquetPackage;

import java.util.HashMap;
import java.util.Map;

public class flowerTypePriceInventory {

	static Map<String, Integer> flowerTypePrice = new HashMap<>();;

	static {
		flowerTypePrice.put("Rose", 1);
		flowerTypePrice.put("Jasmine", 2);
		flowerTypePrice.put("Lily", 3);
	}

}
