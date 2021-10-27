package bootCampNewJoinee;

//Now we will create a consumer class that will provide the entry point for the client classes to create sub-classes.

public class HomeAppliancesConsumptionFactory {
	
	public static HomeAppliancesConsumption getHomeAppliancesConsumption(HomeAppliancesConsumptionAbstractFactoryInterface factory) 
	{
		return factory.createHomeAppliances();
	}
}
