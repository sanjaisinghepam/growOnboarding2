package bootCampNewJoinee;

public abstract class BouquetAbstarctClass {
	
	public abstract int getRoses();
	
	public abstract int getJasmines();
	
	public abstract int getLilys();
	
	public int cost() 
	{
		return (getRoses()*1 + getJasmines()*2 + getLilys()*3);
	}

}
