package bootCampNewJoinee;

public abstract class HomeAppliancesConsumption {

	 	public abstract String getFanStatus();
	 	public abstract String getBlubStatus();
	 	public abstract String getTVStatus();
	 	public abstract String getLaptopStatus();
		
	 	private int getONOFFStatusValue(String status) 
		{
			if(status.equalsIgnoreCase("ON"))
				return 1;
			else
				return 0;
		}
	 	
	 	public int getPowerLoad() 
		{
			
	 		return 1*getONOFFStatusValue(getFanStatus()) 
					+2*getONOFFStatusValue(getBlubStatus())
					+3*getONOFFStatusValue(getTVStatus())
					+4*getONOFFStatusValue(getLaptopStatus());
			
		}
	 	
	 	
}


