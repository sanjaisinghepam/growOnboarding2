package bootCampNewJoinee;

public class Home2 extends HomeAppliancesConsumption{
	
	private String switchflagFan;
	private String switchflagBlub;
	private String switchflagTV;
	private String switchflagLaptop;
	
	public Home2(String switchflagFan,String switchflagBlub,String switchflagTV, String switchflagLaptop)
	{
		this.switchflagFan=switchflagFan;
		this.switchflagBlub=switchflagBlub;
		this.switchflagTV=switchflagTV;
		this.switchflagLaptop=switchflagLaptop;
	}
	
	@Override
	public String getFanStatus() {
		// TODO Auto-generated method stub
		return this.switchflagFan;
	}

	@Override
	public String getBlubStatus() {
		// TODO Auto-generated method stub
		return this.switchflagBlub;
	}

	@Override
	public String getTVStatus() {
		// TODO Auto-generated method stub
		return this.switchflagTV;
	}

	@Override
	public String getLaptopStatus() {
		// TODO Auto-generated method stub
		return this.switchflagLaptop;
	}

}
