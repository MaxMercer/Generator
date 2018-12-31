import java.util.Random;
import java.util.Vector;

public class Community 
{
	String myType;
	
	String myFellowship;
	
	String myHeadFaction;
	
	Profile myLeader;
	
	String myTechnology;
	
	String myWealth;
	
	String myDeviance;
	
	Community()
	{
		myType=genType();
		
		
		myFellowship = genFellow();
		
		//myHeadFaction = faction;
		
		//myLeader = leader;
		
		myTechnology = genTech();
		
		myWealth = genWealth();
		
		myDeviance = genDeviance();
		
	}
	
	public String genTech()
	{
		String tech="";
		
		Random r = new Random();
		
		int t;
		
		t = r.nextInt(4);
		
		if(t==0)
		{
			tech = "Supreme";
		}
		
		if(t==1)
		{
			tech = "Low";
		}
		
		if(t==2)
		{
			tech = "Mid";
		}
		
		if(t==3)
		{
			tech = "High";
		}
		
		return tech;
	}
	
	public String genDeviance()
	{
		String dev="";
		
		Random r = new Random();
		
		int t;
		
		t = r.nextInt(4);
		
		if(t==0)
		{
			dev = "Depraved";
		}
		
		if(t==1)
		{
			dev = "Low";
		}
		
		if(t==2)
		{
			dev = "Mid";
		}
		
		if(t==3)
		{
			dev = "High";
		}
		
		return dev;
	}
	
	
	
	public String genWealth()
	{
		String wealth="";
		
		Random r = new Random();
		
		int t;
		
		t = r.nextInt(4);
		
		if(t==0)
		{
			wealth = "Abundant";
		}
		
		if(t==1)
		{
			wealth = "Low";
		}
		
		if(t==2)
		{
			wealth = "Mid";
		}
		
		if(t==3)
		{
			wealth = "High";
		}
		
		return wealth;
	}
	
	
	public String genFellow()
	
	{
		String fellowship;
		
		int var;
		
		Vector fellows = new Vector();
		
		fellows.add("Average");
		
		fellows.add("Stable");
		
		fellows.add("Indivisible");
		
		fellows.add("On the brink of/in the process of an intrastate "
				+ "conflict");
		
		fellows.add("Polarized");
		
		Random r = new Random();
		
		fellowship = (String) fellows.get(r.nextInt(fellows.size()));
		
		if(fellowship.contains("Polari")||fellowship.contains("On the brin"))
		{
			var = r.nextInt(100);
			fellowship=fellowship+", caused by ";
			if(var<25)
			{
				fellowship=fellowship+"religious conflict";
			}
			if(var<50&&var>25)
			{
				fellowship=fellowship+"withdrawal of a greater power";

			}
			
			if(var<75&&var>50)
			{
				fellowship=fellowship+"political conflict";

			}
			
			if(var<100&&var>75)
			{
				fellowship=fellowship+"entrance of a greater power";
			}
		}
		
		return fellowship;
	}
	
	public String genType()
	{
		Vector<String> types = new Vector<String>();
	
		String type;
		
		String res;
		
		//String gov;
		
		types.add("Forest");
		
		types.add("Mountains");
		
		types.add("Jungle");
		
		types.add("Desert");
		
		types.add("Swamp");
		
		types.add("Underwater");
		
		types.add("Remains of an ancient beast");
		
		types.add("Village, Island");
		
		types.add("Village");
		
		types.add("City, Island");
		
		types.add("Sky");
		
		types.add("Underground");
		
		types.add("Suburbs");
		
		Random r = new Random();
		
		type=" / ENVIRONMENT: "+ (types.get(r.nextInt(types.size())));
		
		Vector<String> residences = new Vector<String>();
		
		String residence;
		
		residences.add("Apartment");
		
		residences.add("Farm");
		
		residences.add("Small house");
		
		residences.add("Mansion");
		
		residences.add("Abandoned house");
		
		residences.add("Ruins");
		
		residences.add("Church");
		
		residences.add("Abandoned temple");
		
		residences.add("Medium house");
		
		residences.add("Big house");
		
		type=type+" / RESIDENCE: "+(residences.get(r.nextInt(residences.size())))+" ";

		
		Vector<String> govs = new Vector<String>();
		
		String gov;
		
		govs.add("Republic");
		
		govs.add("Democracy");
		
		govs.add("Theocracy");
		
		govs.add("Const. Monarchy");
		
		govs.add("Monarchy");
		
		govs.add("Militaristic Regime");
		
		govs.add("Techno-Dictatorship");
		
		govs.add("Anarchy");
		
		govs.add("One-party state");
		
		govs.add("Empire");
		
		govs.add("Federation");
		
		govs.add("Chiefdom");
		
		govs.add("Tribal");
		
		govs.add("Colonialist");
		
		type=type+" / GOV: "+(govs.get(r.nextInt(govs.size())))+" ";

		
		return type;
	}
	
	public String toString()
	{
		
		String s;
		
		 s=myType;
		
		s=s+" FELLOW / " + myFellowship+" /";
		
		s=s+" FAC / " +  myHeadFaction+" /";
		
		s=s+" LEAD / " +  myLeader+" /";
		
		s=s+" TECH / " +  myTechnology+" /";
		
		s=s+" WEALTH / " +  myWealth+" /";
		
		s=s+" CRIME / " +  myDeviance+" /";
		
		return s;
		
	}
	
}
