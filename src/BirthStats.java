import java.util.Random;

public class BirthStats 
{

	/*
	 * 12 Months, 28 days each. 
	 * But this Means there are 29 days left? 
	 * Well, the solution is the have a 13th month. This 13th month is 29 days long
	 * The month is known as Kixemir, It translates to without strife. In the instance of a leap year it is the only year
	 * to have 30 days.
	 * Kixemir is a holy month, people born during this time are believed to live a saintly life.
	 * The reason why this month is holy is speculated, but it is said that during the formation
	 * of the calendar, the maker(s) observed the time to be relatively peaceful as well as the birth of Arkoh Lanek, who helped lead Burai to glory
	 */
	
	String day;
	
	String month;
	
	String monthInfo;
	
	BirthStats()
	{
		day = genDay();
		month = genMonth();
		
	}

	private String genMonth() 
	{
		String[] months = {"Becab, (Month of Joy)","Epilan(Month of Honor)","Iupmir (Month of States)","Kixemir (Month of Peace)","Naroh (Month of Sacrifice)",
				"Sokor (Month of Building)","Waursu (Month of Giving Love)","Iour (Month of Resting)","Gecul (Month of Raging Steel)","Luiamir (Month of The Crown)","Kuweb (Month of Magic)","Muxuk'Voh (Month of the Illtide)",
				"Vohib"
		};
		
		Random r = new Random();
		
		int month;
		
		String m;
		
		month = r.nextInt(13);
		
		m=months[month];
		
		if(month==0)
		{
			monthInfo="The month of joy, Becab comes from the goddess Beccam a jovial goddess who often holds festivities. ";
		}
		
		if(month==1)
		{
			monthInfo="The month of honor, Epilan comes from a harrowing battle in a province of the same name. It is a month that encourages remembering ancestry and people who have passed.";
		}
		
		
		if(month==2)
		{
			monthInfo="The month of states, Iupmir means without silence. It is a month that encourages dialog between the government and people as well as other nations.";
		}
		
		if(month==3)
		{
			monthInfo="Kixemir is a very holy month. Its name means without strife. No wars or battles may occur during this month. People are encouraged to celebrate peace and the saints. On the final day of the month people offer worship until the midnight pass.";
		}
		
		if(month==4)
		{
			monthInfo="A month with origins in the fact a grand sacrifice would occur. While blood sacrifices no longer occur due to the introduction of the new faith, people are encouraged to give up something.";
		}
		
		if(month==5)
		{
			monthInfo="The name origin for this month is unclear. ";
		}
		
		if(month==6)
		{
			monthInfo = "The name of this month comes from a similar word relating to coitus. Why the month was named this is unknown.";
		}
		
		if(month==7)
		{
			monthInfo= "A month with a name that has an unclear meaning. However, it is speculated that it is derived from a similar word that means rest from war.";
		}
		
		if(month==8)
		{
			monthInfo= "This is a month with a name that promotes war against enemies and those of weak faith. While war in the modern era is not encouraged, it is used to support the war against monsters.";
		}

		if(month==9)
		{
			monthInfo="Luiamir means without rule. The month is important to the country for a few reasons. It marked the start of the citizens electorate, is the month when tribe unification is celebrated, and is the month that holds the day in which citizens and statesmen alike meet for dialog. All in all the month promotes peace between people and leaders.";
		}
		
		return null;
	}

	private String genDay() 
	{
		return Integer.toString(1 + new Random().nextInt(28));
	}
	
	
}
