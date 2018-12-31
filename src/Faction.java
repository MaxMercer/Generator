import java.util.Random;
import java.util.Vector;

public class Faction 
{

	String myName;
	
	String myType;
	
	String myPopularity;
	
	String mySize;
	
	Profile myLeader;
	
	Faction()
	{
		
		
		myType = genType();
		
		myName = genName();
		
		myPopularity = genPopularity();
		
		myLeader = new Profile();
		
		mySize = genSize();
	
	}
	
	private String genSize()
	{
		
		int size=0;
		
		if(myLeader.myReligion.myPopularity.contains("Fami"))
		{
			size=(int) (Double.parseDouble((myLeader.myReligion.myNumberOfFollowers))*10);
			size=size+new Random().nextInt(5);
			
			return String.valueOf(size);
		}
		
		if(myLeader.myReligion.myPopularity.contains("Loc"))
		{
			size=Integer.parseInt(myLeader.myReligion.myNumberOfFollowers)*100;
			size=(int) (size+new Random().nextGaussian()*4+67);
			return String.valueOf(size);
		}
		
		return String.valueOf((int) (new Random().nextGaussian()*15+238));
	}
	
	private String genPopularity()
	{
		Vector l = new Vector();
		
		l.add("Strikes terror by name");
		l.add("Who hasn't heard of them?");
		l.add("Almost unheard of");
		l.add("Known and admired locally");
		l.add("Known and disliked locally");
		l.add("Known and admired in the country");
		l.add("Known and disliked in the country");
		l.add("Forgotten ages ago.");
		
		return (String) l.get(new Random().nextInt(l.size()));
	}
	
	private String genType()
	{
		String t;
		
		Vector v = new Vector();
		
		v.add("Guild");
		v.add("Family");
		v.add("Clan");
		v.add("Chivalric Order");
		v.add("Holy Order");
		v.add("Private Military/Band of Mercenaries");
		v.add("Tribe");
		v.add("Cult");
		
		myType = (String) v.get(new Random().nextInt(v.size()));
		
		return (String) v.get(new Random().nextInt(v.size()));
	}
	
	private String genName()
	{
		String name="";
		if(myType=="Family"||myType=="Tribe"||myType=="Clan")
		{
			
		
		char[] alphabetLow = "abcdefghiklmnoprstuvwxy".toCharArray();
		
		char[] vowelsLower ="aeiouy".toCharArray();
		
		char[] vowelsUpper = "AEIOUY".toCharArray();
		
		char[] alphabetUpper = "abcdefghiklmnoprstuvwxy".toUpperCase().toCharArray();
		
		int randVar = (int) (Math.random()*21)+0;
		
		int i = 0;
		
		int nameSize = (int) (Math.random()*1)+4;
		
		
		
		name = name+alphabetUpper[randVar];
		
		if(name.contains("F")||name.contains("T"))
		{
			
			if(randVar%5==0)
			{
			name = name+"ra";
			i = 2;
			}
			
			if(randVar%2==0)
			{
			name = name+"io";
			i = 2;
			}
			
			
			
		}
		
		
		if(name.startsWith("R"))
		{
			name=name+"ay";
			i=2;
		}
		
		if(name.startsWith("N"))
		{
			if(randVar%5==0)
			{
			name = name+"eu";
			i = 2;
			}
		}
		
		for(; i <nameSize; )
		{
			
			
			if(name.charAt(i)!='a'||name.charAt(i)!='e'||name.charAt(i)!='o'
					||name.charAt(i)!='y'||name.charAt(i)!='u'
					)
							
			{
				
				randVar = (int) (Math.random()*5)+0;
				name = name+vowelsLower[randVar];
				i++;
				
				
			}
			
			randVar = (int) (Math.random()*22)+0;
			name = name+alphabetLow[randVar];
			i++;
			
			
			if(name.charAt(i)=='u')
			{
				name = name +"rsu";
				
				i=i+2;
			}
		
			if(name.charAt(i)=='a')
			{
				name=name+"ul";
				i=i+2;
			}
			
			if(name.charAt(i)=='o')
			{
				name=name+"ur";
				
				i=i+2;
			}
			
		}
		
		randVar = (int) (Math.random()*26)+0;
		
		if(randVar%2==0) {
		
		if(name.endsWith("l"))
		{
			name=name+"of";
		}
		
		
		if(name.endsWith("f"))
		{
			name=name+"elle";
		}
		
		if(name.endsWith("m")||name.endsWith("of"))
		{
			name=name+"ir";
		}
		
	
		name=name+" "+myType;
		
		if(myType=="Family"||myType=="Tribe")
		{
		return name;
		}

		}
		}
		
		Vector ad = new Vector();
		
		Vector it = new Vector();
		
		ad.add("Dark");
		ad.add("Grim");
		ad.add("Hallowed");
		ad.add("Silent");
		ad.add("Shadow");
		ad.add("Crimson");
		ad.add("Soul");
		ad.add("Crypt");
		ad.add("Golden");
		ad.add("Wild");
		ad.add("Mad");
		ad.add("Elite");
		ad.add("Venom");
		ad.add("Black");
		ad.add("Mountain");
		ad.add("Low-Born");
		ad.add("Mercy");
		ad.add("Glory-Seeking");
		ad.add("Midnight");
		ad.add("Radiant");
		ad.add("Dusk");
		ad.add("Dawn");
		ad.add("Ageless");
		ad.add("Haunting");
		ad.add("Corrupted");
		ad.add("Vengeful");
		ad.add("Sleepless");
		ad.add("Angelic");
		ad.add("Harrowing");
		ad.add("Silver");
		ad.add("Steel");
		ad.add("Iron");
		ad.add("Swamp");
		ad.add("Desert");
		ad.add("Sky");
		ad.add("Lake");
		
		it.add("Hammers");
		it.add("Birds");
		it.add("Swords");
		it.add("Knights");
		it.add("Bees");
		it.add("Bears");
		it.add("Wolves");
		it.add("Foxes");
		it.add("Beetles");
		it.add("Lions");
		it.add("Fighters");
		it.add("Dogs");
		it.add("Hunters");
		it.add("Guard");
		it.add("Soldiers");
		it.add("Footmen");
		it.add("Weavers");
		it.add("Builders");
		it.add("Craftsmen");
		it.add("Oracles");
		it.add("Sirens");
		it.add("Flowers");
		it.add("Petals");
		it.add("Pawns");
		it.add("Kings");
		it.add("Queens");
		it.add("Royals");
		it.add("Spears");
		it.add("Thorns");
		it.add("Stalkers");
		it.add("Giants");
		it.add("Ghouls");
		
		if(myType!="Family"||myType!="Tribe")
		{
		name=name+" "+myType+" of "+ad.get(new Random().nextInt(ad.size()))+" "+it.get(new Random().nextInt(it.size()));
		}
		
		//System.out.println(name);
		
		return name;
		
		
		
	}
	
	public String toString()
	{
		String s;
		
		s = myName+", with the reputation: "+myPopularity+", led by: "+myLeader.myName+", with a size of: "+mySize+" people";
		
		//System.out.println(s);
				
		return s;
	}
}
