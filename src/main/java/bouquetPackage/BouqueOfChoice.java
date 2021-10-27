package bouquetPackage;

import java.util.Map;

public class BouqueOfChoice extends Bouque{
	
	private  Map<String, Integer> flowerTypeNumber;
	private  String nameOfBouque;
	
	public BouqueOfChoice(Map<String, Integer> flowerTypeNumber , String nameOfBouque) {
		
		this.flowerTypeNumber = flowerTypeNumber;
		this.nameOfBouque = nameOfBouque;
	}


	@Override
	public Map<String, Integer> getFlowerTypeNumber() {
		return this.flowerTypeNumber;
	}


	@Override
	public String getBouqueName() {
		return this.nameOfBouque;
	}

}
