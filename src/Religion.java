import java.util.Random;

public class Religion 
{

	String myPantheonSize;
	
	String myDenomination;
	
	String myPopularity;
	
	String myNature;
	
	String myNumberOfFollowers;
	
	Religion()
	{
		
		myDenomination = genDenom();
		
		myPopularity = genPopularity();
		
		myNature = genNature();
		
		myNumberOfFollowers = genFollowers();
		
		myPantheonSize = genSize();
	}

	private String genNature() 
	{
		String[] natures = new String[9];
		
		
		natures[0] = "Peaceful";
		
		natures[1] = "Warmongering";
		
		natures[2] = "Universal love";
		
		natures[3] = "Sacrifical";
		
		natures[4] = "Tied to nature";
		
		natures[5] = "End reincarnation";
		
		natures[6] = "Violent";
		
		natures[7] = "Harmonistic";
		
		natures[8] = "Wisdom, spiritual strength";
		
		return "NATURE: "+ natures [new Random().nextInt(9)];
	}

	private String genFollowers() {

		Double size;
		
		Random r = new Random();
		
		size=r.nextGaussian()*15+70;
		
		if(myPopularity.contains("Hat"))
		{
			size=size-40;
		}
		
		if(myPopularity.contains("Loc"))
		{
			size=r.nextGaussian()*3+1;
		}
		
		if(myPopularity.contains("Famili"))
			size=r.nextGaussian()*.0175+.1;
		
		if(myPopularity.contains("Widespre"))
			size=size+950;
		
		if(myPopularity.contains("Conti"))
			size=size+100;
		
		if(myPopularity.contains("Count"))
			size=size+80;
		
		return String.valueOf(size);
	
	}

	private String genPopularity() 
	{

		String[] level = new String[6];
		
		level[0] = "Hated";
		
		level[1] = "Local";
		
		level[2] = "Familial, clan";
		
		level[3] = "Widespread, worldwide access";
		
		level[4] = "Continental";
		
		level[5] = "Country";
		
		Random ran = new Random();
		
		
		
		return "POPULARITY: "+level[ran.nextInt(6)];
	}

	private String genDenom() 
	{

		String[] denoms = new String[7];
		
		denoms[0] = "Monotheistic";
		
		denoms[1] = "Polytheistic";
		
		denoms[2] = "Monotheistic Cult";
		
		denoms[3] = "Monotheistic Sect";
		
		denoms[4] = "Polytheistic Cult";
		
		denoms[5] = "Polytheistic Sect";
		
		denoms[6] = "Spiritualist";
		
		Random ran = new Random();
		
		
		
		return "DENOMINATION: "+denoms[ran.nextInt(7)];
	}

	private String genSize() 
	{
		Random r = new Random();
		
		if(myDenomination.contains("Mono"))
		{
			return "NUMBER OF GODS: 1";
		}

		return "NUMBER OF GODS: "+new Random().nextInt(50);
		
	}
	
	public String toString()
	{
		String s = myPantheonSize+myDenomination+myPopularity+myNature+myNumberOfFollowers;
		
		System.out.println( myPantheonSize);
		
		System.out.println(myDenomination);
		
		System.out.println(myPopularity);
		
		System.out.println( myNature);
		
		System.out.println("Follower Count: "+ myNumberOfFollowers+" thousand");
		
		return null;
	}
	
}
