package bootCampNewJoinee;

public class BouquetParty extends BouquetAbstarctClass{

	private int roses;
	private int jasmines;
	private int lilys;
	
	public BouquetParty(int roses, int jasmines, int lilys) 
	{
		this.roses=roses;
		this.jasmines=jasmines;
		this.lilys=lilys;
	}
	
	
	@Override
	public int getRoses() {
		// TODO Auto-generated method stub
		return this.roses;
	}

	@Override
	public int getJasmines() {
		// TODO Auto-generated method stub
		return this.jasmines;
	}

	@Override
	public int getLilys() {
		// TODO Auto-generated method stub
		return this.lilys;
	}

}
