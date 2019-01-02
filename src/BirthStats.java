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
		
		
		
		return null;
	}

	private String genDay() 
	{
		return Integer.toString(1 + new Random().nextInt(28));
	}
	
	
}
