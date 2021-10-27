package bootCampNewJoinee;

public class Home2FactoryClass implements HomeAppliancesConsumptionAbstractFactoryInterface{
	
	private String switchflagFan;
	private String switchflagBlub;
	private String switchflagTV;
	private String switchflagLaptop;
	
	public Home2FactoryClass(String switchflagFan,String switchflagBlub,String switchflagTV, String switchflagLaptop)
	{
		this.switchflagFan=switchflagFan;
		this.switchflagBlub=switchflagBlub;
		this.switchflagTV=switchflagTV;
		this.switchflagLaptop=switchflagLaptop;
	}

	@Override
	public HomeAppliancesConsumption createHomeAppliances() {
		return new Home2(switchflagFan,switchflagBlub,switchflagTV,switchflagLaptop);
	}
}
