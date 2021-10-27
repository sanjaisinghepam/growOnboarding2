package bootCampNewJoinee;

public class HomeAppliancesMainClass {

	public static void main(String[] args) {
		//with any design pattern
		HomeAppliances load = new HomeAppliances("ON", "OFF", "OFF", "on");
		System.out.println("Power load at given point is "+load.getPowerLoad());
		
		for(String naemOfAppliances : load.appliancesSort())
		{
			System.out.println(naemOfAppliances);
		}
		System.out.println("-----------------------------");
		//with abstract factory design pattern
		
		HomeAppliancesConsumption home1=HomeAppliancesConsumptionFactory.
				getHomeAppliancesConsumption(new Home1FactoryClass("ON", "OFF", "OFF", "on"));
		System.out.println("Power load at home1 "+home1.getPowerLoad());
		System.out.println("----------appliances sorted in ascending order-------------------");
		String[] appliancesName = {"Fan","Bulb","Tv","Laptop"};
		for(String applianceName : AppliancesSorting.appliancesSortByName(appliancesName))
		{
			System.out.println("appliances name: "+applianceName);
		}
	}

}
