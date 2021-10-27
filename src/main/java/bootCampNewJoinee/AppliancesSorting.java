package bootCampNewJoinee;

public class AppliancesSorting {
	
	public static String[] appliancesSortByName(String[] appliancesName) 
	{
		for(int i=0; i<appliancesName.length ; i++) 
		{
			for(int j=i+1; j<appliancesName.length ;j++) 
			{
				if(appliancesName[i].compareToIgnoreCase(appliancesName[j]) > 0) 
				{
					String temp = appliancesName[j];
					appliancesName[j]= appliancesName[i];
					appliancesName[i] = temp;
				}
			}
		}
		
		return appliancesName;
	}
	
	public static int[] appliancesSortByUnitCosumption(int[] appliancesUnitConsumption) 
	{
		for(int i=0; i<appliancesUnitConsumption.length ; i++) 
		{
			for(int j=i+1; j<appliancesUnitConsumption.length ;j++) 
			{
				if(appliancesUnitConsumption[i] > appliancesUnitConsumption[j]) 
				{
					int temp = appliancesUnitConsumption[j];
					appliancesUnitConsumption[j]= appliancesUnitConsumption[i];
					appliancesUnitConsumption[i] = temp;
				}
			}
		}
		
		return appliancesUnitConsumption;
	}

}
