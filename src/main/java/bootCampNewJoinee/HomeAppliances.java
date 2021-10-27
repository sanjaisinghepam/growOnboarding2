package bootCampNewJoinee;

public class HomeAppliances {
	
	private String switchflagFan;
	private String switchflagBlub;
	private String switchflagTV;
	private String switchflagLaptop;
	private String[] appliances = {"Fan", "Blub", "TV", "Laptop"};
	
	
	//give "ON" if appliance is running or consuming power
	public HomeAppliances(String switchflagFan, String switchflagBlub, String switchflagTV, String switchflagLaptop) 
	{
		this.switchflagFan=switchflagFan;
		this.switchflagBlub=switchflagBlub;
		this.switchflagTV=switchflagTV;
		this.switchflagLaptop=switchflagLaptop;
	}
	
	public String getFanStatus() 
	{
		return this.switchflagFan;
	}
	
	public String getBlubStatus() 
	{
		return this.switchflagBlub;
	}
	
	public String getTVStatus() 
	{
		return this.switchflagTV;
	}
	
	public String getLaptopStatus() 
	{
		return this.switchflagLaptop;
	}
	
	public int getONOFFStatusValue(String status) 
	{
		if(status.equalsIgnoreCase("ON"))
			return 1;
		else
			return 0;
	}
	
	// consider power consumption FAN: 1 Unit , Blub: 2 , TV: 3, Laptop:4
	
	//we are using unit consumption hard coded but if need arises we can get value from user also
	public int getPowerLoad() 
	{
		return 1*getONOFFStatusValue(getFanStatus()) 
				+2*getONOFFStatusValue(getBlubStatus())
				+3*getONOFFStatusValue(getTVStatus())
				+4*getONOFFStatusValue(getLaptopStatus());
		
	}
	
	public String[] appliancesSort() 
	{
		for(int i=0; i<appliances.length ; i++) 
		{
			for(int j=i+1; j<appliances.length ;j++) 
			{
				if(appliances[i].compareToIgnoreCase(appliances[j]) > 0) 
				{
					String temp = appliances[j];
					appliances[j]= appliances[i];
					appliances[i] = temp;
				}
			}
		}
		
		return appliances;
	}
	
	

}
