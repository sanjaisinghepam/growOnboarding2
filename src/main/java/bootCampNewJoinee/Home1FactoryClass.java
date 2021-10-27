package bootCampNewJoinee;

public class Home1FactoryClass implements HomeAppliancesConsumptionAbstractFactoryInterface{

	private String switchflagFan;
	private String switchflagBlub;
	private String switchflagTV;
	private String switchflagLaptop;
	
	public Home1FactoryClass(String switchflagFan,String switchflagBlub,String switchflagTV, String switchflagLaptop)
	{
		this.switchflagFan=switchflagFan;
		this.switchflagBlub=switchflagBlub;
		this.switchflagTV=switchflagTV;
		this.switchflagLaptop=switchflagLaptop;
	}

	@Override
	public HomeAppliancesConsumption createHomeAppliances() {
		return new Home1(switchflagFan,switchflagBlub,switchflagTV,switchflagLaptop);
	}
}
