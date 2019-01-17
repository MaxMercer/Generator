import java.util.Random;
import java.util.Vector;

public class Profile 
{

	String myName;
	
	String myAge;
	
	String myGender;
	
	String[] myQuirks;
	
	Community myCommunity;
	
	String myOccupation;
	
	String mySES;
	
	String myHumour;
	
	Religion myReligion;
	
	Faction myFaction;
	
	String myPopularity;
	
	String myAccomplishments;
	
	String mySO;
	
	BirthStats myBirth;
	
	Profile()
	{
		myName = genName();
		
		myAge = genAge();
		
		myGender = genGender();
		
		myQuirks = genQuirks();
		
		myOccupation = genJob();
		
		myCommunity = new Community();
		
		mySES = genSES();
		
		myReligion = new Religion();
		
		myHumour = genHumour();
		
		myPopularity = genPopularity();
		
		myAccomplishments = genAccomplishments();
		
		mySO=genSO();
		
	}
	
	public void genNewSO()
	{
		mySO = this.genSO();
	}
	
	private String genSO() 
	{

		int var;
		
		String so = null;
		
		Random r = new Random();
		
		var = r.nextInt(500);
		
		so="S";
		
		if(var%2==0)
		{
			so="S";
		}
		
		if(var%3==0)
		{
			so="G";
		}
		
		
		if(var%4==0)
		{
			so="P";
		}
		
		if(var%36==0)
		{
			so="A";
		}
		
		
		return so;
	}

	private String genAccomplishments() 
	{
		Vector n = new Vector();
		
		Vector a = new Vector();
		
		Vector v = new Vector();
		
		Vector s = new Vector();
		
		Vector o = new Vector();
		
		Random r = new Random();
		
		int var;
		
		a.add("a ragged");
		a.add("a wandering");
		a.add("a mysterious");
		a.add("a lost");
		a.add("an immortal");
		a.add("a holy");
		a.add("an insane");
		a.add("a corrupt");
		a.add("an upstanding");
		a.add("a cursed");
		a.add("a sinister");
		a.add("a scary");
		a.add("an awkward");
		a.add("a frail");
		a.add("a weak");
		a.add("a strong");
		a.add("a foreign");
		a.add("an unholy");
		a.add("a dominating");
		a.add("a meek");
		a.add("a shy");
		a.add("an eager");
		
		n.add("wanderer");
		n.add("sailor");
		n.add("judge");
		n.add("law");
		n.add("prisoner");
		n.add("witch");
		n.add("sorceror");
		n.add("jailor");
		n.add("friend");
		n.add("family member");
		n.add("cultist");
		n.add("priest");
		n.add("nun");
		n.add("hunter");
		n.add("governor");
		n.add("servant");
		n.add("slave");
		n.add("soldier");
		n.add("apprentice");
		n.add("faction leader");
		n.add("shaman");
		n.add("fletcher");
		n.add("tailor");
		n.add("surgeon");
		n.add("farmer");
		n.add("cobbler");
		n.add("pilgrim");
		n.add("mercenary");
		n.add("thief");
		n.add("jeweler");
		n.add("adventurer");
		n.add("warrior");
		n.add("mage");
		n.add("alchemist");
		n.add("necromancer");
		n.add("monster hunter"); 
		
		
		var = r.nextInt(100);
		if(var<50)
		{
		v.add("steal from ");
		//v.add("Fight a ");
		//v.add("Recover a ");
		v.add("aid the people in ");
		v.add("take down the people in ");
		v.add("smuggle something/someone into ");
		v.add("kidnap someone from ");
		//v.add("Ransom a ");
		v.add("sabatoge ");
		v.add("protect ");
		v.add("hide in ");
		//v.add("Train a ");
		v.add("find ");
		v.add("destroy ");
		
		s.add("a fortress");
		s.add("a cult");
		s.add("a high ranking officer of some organization");
		s.add("a group of bandits");
		s.add("a group of monsters");
		s.add("a rising coup");
		s.add("a band of rebels");
		s.add("a tribe");
		s.add("a dungeon");
		s.add("a boat lost at sea");
		s.add("a noble");
		s.add("a monster");
		s.add("an artefact");
		s.add("a monster");
		s.add("a demon");
		s.add("a tomb");
		s.add("a graveyard");
		s.add("an abandoned town");
		s.add("a monestary");
		s.add("an old temple");
		s.add("ruins");
		}else {
			v.add("steal ");
			v.add("fight ");
			v.add("aid ");
			v.add("take down ");
			v.add("kidnap ");
			v.add("ransom ");
			v.add("sabatoge ");
			v.add("protect ");
			v.add("hide ");
			v.add("train ");
			v.add("find ");
			
			s.add("an enemy faction member");
			s.add("a high ranking officer of some organization");
			s.add("a group of bandits");
			s.add("a group of monsters");
			s.add("a rising coup");
			s.add("a band of rebels");
			s.add("a witch");
			s.add("a necromancer");
			s.add("a sorceror");
			s.add("a corrupt governor");
			
			s.add("a noble");
			s.add("a monster");
			s.add("an artefact");
			s.add("a monster");
			s.add("a demon");
			
		}
		
		
		
		
		String acc="Helped ";
		
		acc=(String)acc+  a.get(r.nextInt(a.size()))+" ";
		acc=(String) acc + n.get(r.nextInt(n.size()))+" ";
		acc=(String) acc + v.get(r.nextInt(v.size()));
		acc=(String) acc +s.get(r.nextInt(s.size()));
		return acc;
	}
	
	public void genNewPopularity()
	{
		myPopularity = this.genPopularity();
	}

	private String genPopularity() 
	{
		String s;
		
		Vector v = new Vector();
		
		v.add("Unknown");
		v.add("Not well known locally");
		v.add("Well-known locally and well liked");
		v.add("Well-known locally and feared");
		v.add("Well-known locally and disliked");
		v.add("Well-known in the country and well liked");
		v.add("Well-known in the country and feared");
		v.add("Well-known in the country and disliked");
		v.add("Known and loved by all");
		v.add("Known and hated by all");
		v.add("Known and feared by all");
		v.add("Known and worshipped locally");
		v.add("Known and worshipped in the country");
		v.add("Known and worshipped in several countries");
		
		
		s = (String) v.get(new Random().nextInt(v.size()));
		
		return s;
	}

	public String genNewName()
	{
		return myName = this.genName();
	}
	
	private String genName()
	{
		String name="";
		
			
		
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
		
	
		return name;
		
		

		}
		return name;
		
	}
	
	public void genHumor()
	{
		myHumour = this.genHumour();
	}
	
	private String genHumour()
	{
		Vector v = new Vector();
		
		v.add("None");
		v.add("Quirky");
		v.add("Cringe");
		v.add("Dark");
		v.add("Schadenfreude");
		v.add("Black");
		v.add("Self-deprication");
		v.add("Observational");
		v.add("Puns!");
		v.add("Dad humour");
		v.add("Storytelling");
		v.add("Racy");
		v.add("Witty");
		v.add("Intelligent");
		
		return (String) v.get(new Random().nextInt(v.size()));
	}
	
	public void genNewSES()
	{
		mySES = this.genSES();
	}
	
	private String genSES()
	{
		Random r = new Random();
		
		int var;
		
		var = r.nextInt(350);
		
		if(var>0&&var<100)
		{
			return "Poor";
		}
		
		if(var>101&&var<200)
		{
			return "Middle";
		}
		
		if(var>201&&var<300)
		{
			return "Upper";
		}
		
		if(var>301&&var<350)
		{
			return "Elite";
		}
		return null;
		
		
	}
	
	public void genNewJob()
	{
		myOccupation = this.genJob();
	}
	
	private String genJob()
	{
		Vector v = new Vector();
		
		int age;
		
		String job = "";
		
		age = (int) Double.parseDouble(myAge);
		
		if(age<16)
		{
			return "Learning, student";
		}
		
		if(age<21)
		{
			job= "Learning: ";
		}
		
		v.add("Student");
		v.add("Farmer");
		v.add("Secretary");
		v.add("Militia)");
		v.add("Teacher");
		v.add("Cobbler");
		v.add("Apprentice");
		v.add("Merchant");
		if(myGender =="f");
		{
			v.add("Lady in waiting");
			v.add("Maid");
		}
		
		v.add("Servant");
		v.add("Cheiftan");
		v.add("Governor");
		v.add("Guild/Faction/Clan leader");
		v.add("Trapper");
		v.add("Hunter");
		v.add("Smith");
		v.add("Story teller");
		v.add("Surgeon");
		v.add("Tailor");
		v.add("Spy");
		v.add("Smuggler");
		v.add("Slave");
		v.add("Thief");
		v.add("Mercenary");
		v.add("Baker");
		v.add("Healer");
		v.add("Court mage");
		v.add("Alchemist");
		v.add("Carriage driver");
		v.add("Iron coach maker");
		v.add("Taxman");
		v.add("Map maker");
		v.add("Jeweler");
		v.add("Undertaker");
		v.add("Nurse");
		v.add("Necromancer");
		v.add("Potion maker");
		v.add("Fletcher");
		v.add("Caravan Leader");
		v.add("Scabbard maker");
		v.add("Shaman");
		v.add("Squire");
		v.add("Scribe");
		v.add("Footman");
		v.add("Dancer");
		v.add("Chatelaine");
		v.add("Prostitute");
		v.add("Diviner");
		v.add("Royal huntsman");
		v.add("Monster slayer");
		
			
			
			Random r = new Random();
			
			job = job + (String) v.get(r.nextInt(v.size()));
		
			return job;
	}
	
	public void genNewQuirks()
	{
		myQuirks = this.genQuirks();
	}
	
	private String[] genQuirks() 
	{
		Vector v = new Vector();
		
		v.add("Likes shiny objects");
		
		v.add("Stares at people a little too long");
		
		v.add("Never makes eye contact");
		
		v.add("Needs to keep notes of everything");
		
		v.add("Suspicious of people");
		
		v.add("Hordes jewelry");
		
		v.add("Slips foreign language into conversations to sound more cultured");
		
		v.add("Knows cardinal direction at any given time");
		
		v.add("Keeps a lucky charm");
		
		v.add("Is a nudist");
		
		v.add("Loves monsters");
		
		v.add("Has an unusual charm reminiscent of a deceased lover/friend");
		
		v.add("Only wears wigs");
		
		v.add("Is unsure as to who they really are, making a new persona almost once a month");
		
		v.add("Isn't convinced strangers are who they say they are");
		
		v.add("Can't stand foreign music");
		
		v.add("Oddly excessively feminine/masculine");
		
		v.add("Listens to old music only");
		
		v.add("Hordes dolls");
		
		v.add("Hates dolls");
		
		v.add("Obsessed with the same/opposite sex regardless of attraction");
		
		v.add("Tries to predict others' past");
		
		v.add("Is forgetful");
		
		v.add("Remembers almost everything");
		
		v.add("Can do math in their head extremely fast");
		
		v.add("Can read through thick volumes of texts with great understanding"
				+ "in a short period of time");
		
		v.add("Can accurately recite pages of encylopedias and dictionaries");
		
		v.add("Has an unusual fascination for death");
		v.add("Hates foreigners");
		
		v.add("only likes foreigners");
		
		v.add("Only whistles the same tune");
		
		v.add("Overly apologises");
		
		v.add("Speaks poetically");
		
		v.add("Tells very bad jokes");
		
		v.add("Stutters a lot");
		
		v.add("Treats their weapon like it's a child.");
		v.add("Gives everything 'cool' nicknames");
		v.add("Prays frequently");
		v.add("Says a prayer/apologises before harming something.");
		v.add("Uses large words");
		v.add("Collector of plush animals");
		v.add("Crossdresses.");
		v.add("Is flamboyant/tomboyish");
		v.add("Has a fear of open doors");
		v.add("Can't leave home without a certain sentimental object");
		v.add("Can't remember names well.");
		v.add("Brags about mundane things");
		v.add("Obsesses over their, and other's, images.");
		v.add("Self depricates a lot");
		
		Random r = new Random();
		
		String[] q = new String[3];
		
		q[0] = (String) v.get(r.nextInt(v.size()));
		q[1] = (String) v.get(r.nextInt(v.size()));
		q[2] = (String) v.get(r.nextInt(v.size()));
		
		return q;
	}

	public void genNewGender()
	{
		myGender = this.genGender();
	}
	
	private String genGender()
	{
		Random r = new Random();
		
		int var;
		
		String g="";
		
		var = (int) r.nextInt(200);
		
		String[] arr = new String[4];
		
		arr[0] = "f";
		
		arr[1] = "m";
		
		arr[2] = "mf";
		
		arr[3] = "fm";
		
		String[] gr = new String[3];
	
		if(var<30)
		{
			if(var<15)
			{
				g= arr[3];
				System.out.println(g);
				return g;
			}
			
			
				g= arr[2];
				System.out.println(g);

				return g;
			
		}
		
		if(var>31&&var<115)
		{
			g= arr[1];
			System.out.println(g);

			return g;
		}else {
			g= arr[0];
			System.out.println(g);

			return g;
		}
		
	}
	
	public void genNewAge()
	{
		myAge = this.genAge();
	}
	
	private String genAge()
	{	
		double age = 0;
		
		Random r = new Random();
		int var = 0;
		
		
		var = r.nextInt(3);
		
		System.out.println("Rolled a: "+var);
		
		if(var == 0)
		{
			
			age = r.nextInt(6);
			
			age=age+12;
			
			age=Math.round(age);
			
			
		}
		
		if(var == 1)
		{
			
			age = +r.nextInt(12);
			
			age=Math.round(age)+18;
			
			
		}
		
		if(var == 2)
		{
			
			age = r.nextInt(12);
			age=age+8;
			age=Math.round(age);
			
			
			
	}
		
		return Double.toString(age);
		
	}
		
	public String toString()
	{
		String s;
		
		s = myName+myAge+myQuirks+myCommunity.toString();
		
		System.out.println("NAME: "+myName);
		
		System.out.println("AGE: "+ myAge);
		
		System.out.println("JOB: "+myOccupation);
		
		System.out.println("ACCOMPLISHMENTS: "+myAccomplishments);
		
		System.out.println("QUIRKS: "+myQuirks[0]+", "+myQuirks[1]+", "+myQuirks[2]);
		
		System.out.println("COMMUNITY: "+myCommunity);
		
		System.out.println("SES: "+mySES);
		
		System.out.println("SO: "+mySO );
		
		System.out.println("FAITH: "+myReligion.toString());
		
		System.out.println("HUMOUR: "+myHumour);
		
		System.out.println("POPULARITY: "+myPopularity );
		
		System.out.println("FACTION: "+new Faction());
		
		
		
		System.out.println(myReligion);
		return null;
		
	}
	
}
