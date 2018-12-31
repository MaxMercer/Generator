import java.util.Scanner;

public class Names {

	public static void main(String[] args) 
	{
		writeName();

	}

	private static void writeName()
	{
		int picker;
		
		int howMany;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Choose Culture");
		System.out.println();
		System.out.println("1: f");
		System.out.println();
		System.out.println("2: G");
		System.out.println();
		System.out.println("3: F");
		System.out.println();
		System.out.println("4: EXIT");
		System.out.println();
		
		
		for(int i = 0; i < 1;)
		{
			System.out.println("Choose Culture");
			System.out.println();
			System.out.println("1: E");
			System.out.println();
			System.out.println("2: Ger");
			System.out.println();
			System.out.println("3: Fr");
			System.out.println();
			System.out.println("4: Ne");
			System.out.println("5: exit");
			System.out.println();
			
			picker = k.nextInt();
		
		if(picker == 1)
		{
			
			System.out.println("How many times ");
			howMany=k.nextInt();
			for(int j = 0; j < howMany; j++)
			{
				writeTorrel();
			}
		}
		
		if(picker == 2)
		{
			System.out.println("How many times ");
			howMany=k.nextInt();
			for(int j = 0; j < howMany; j++)
			{
				writeDrakhau();
			}

		}
		
		if(picker == 3)
		{
			System.out.println("How many times ");
			howMany=k.nextInt();
			for(int j = 0; j < howMany; j++)
			{
				writeAreau();
			}

		}
		
		if(picker == 4)
		{
			System.out.println("How many times ");
			howMany=k.nextInt();
			for(int j = 0; j < howMany; j++)
			{
				writeNeu();
			}

		}
		if(picker==5)
			i++;
		}
		
			
	}

	/**
	 * Torrelof naming customs
	 * In a unique sense, the letter 'v' makes a
	 * 'weh' sound.
	 * 
	 *  of sounds like "oph" or "off". It means 'of'
	 *  
	 *  elle is not the same as el.
	 *  
	 *  Elle is feminine and el is masculine. Names ending with
	 *  F are more likely to be feminine, but names starting with
	 *  F are more likely to be masculine. Names ending with this after "of"
	 *  mean "of the people" most of the time.
	 *  
	 *  EX: Kitalofelle = Kital, woman of the people. Kital is likely
	 *  To be the name of a family or profession. If Kital means
	 *  "Blacksmith" it would mean blacksmith of the people.
	 *  
	 *  'mut' is stream.
	 *  'yil' is forest
	 */
	private static void writeTorrel() 
	{
		char[] alphabetLow = "abdefiklmnoprstuvwy".toCharArray();
		
		char[] vowelsLower ="aeiouyv".toCharArray();
		
		char[] vowelsUpper = "AEIOUYV".toCharArray();
		
		char[] alphabetUpper = "ABDEFIKLMNOPRSTUVWY".toCharArray();
		
		int randVar = (int) (Math.random()*18)+0;
		
		int i = 0;
		
		int nameSize = (int) (Math.random()*1)+4;
		
		String name="";
		
		name = name+alphabetUpper[randVar];
		
		if(name.contains("F")||name.contains("T"))
		{
			name = name+"or";
			
			i = 2;
		}
		
		if(name.startsWith("Tor"))
		{
			name=name+"t";
			i++;
		}
		
		if(name.startsWith("R"))
		{
			name=name+"ay";
			i=2;
		}
		
		for(; i <nameSize; )
		{
			
			
			if(name.charAt(i)!='a'||name.charAt(i)!='e'||name.charAt(i)!='o'
					||name.charAt(i)!='y'||name.charAt(i)!='u'
					||name.charAt(i)!='v')
							
			{
				
				randVar = (int) (Math.random()*6)+0;
				name = name+vowelsLower[randVar];
				i++;
				
				
			}
			
			randVar = (int) (Math.random()*18)+0;
			name = name+alphabetLow[randVar];
			i++;
			
			
			
			if(name.charAt(i)=='s')
			{
				name=name+"ven";
						i=i+3;
			}
			
			if(name.charAt(i)=='u')
			{
				name = name +"la";
				
				i=i+2;
			}
		
			if(name.charAt(i)=='a')
			{
				name=name+"uw";
				i=i+2;
			}
			
			if(name.charAt(i)=='o')
			{
				name=name+"va";
				
				i=i+2;
			}
			
		}
		
		randVar = (int) (Math.random()*26)+0;
		
		if(randVar%2==0) {
		
		if(name.endsWith("l"))
		{
			name=name+"of";
		}
		
		if(name.endsWith("r"))
		{
			name=name+"rel";
		}
		
		if(name.endsWith("f"))
		{
			name=name+"elle";
		}
		
		if(name.endsWith("m")||name.endsWith("of"))
		{
			name=name+"ut";
		}
		
		if(name.endsWith("p")||name.endsWith("b")||name.endsWith("w")||name.endsWith("of"))
		{
			name=name+"yil";
		}
		
		if(name.endsWith("y")||name.endsWith("i")||name.endsWith("o")
				||name.endsWith("u"))
		{
			name=name+"ven";
		}
		
		}
		
		System.out.println(name);

	}
	
	private static void writeAreau() 
	{
		
		char[] alphabetLow = "abcdefghijklmnopqrstuvwy".toCharArray();
		
		char[] vowelsLower ="aeiou".toCharArray();
		
		char[] vowelsUpper = "AEIOU".toCharArray();
		
		char[] alphabetUpper = "abcdefghijlmnopqrstuvwy".toUpperCase().toCharArray();
		
		int randVar = (int) (Math.random()*22)+0;
		
		int i = 0;
		
		int nameSize = (int) (Math.random()*2)+3;
		
		String name="";
		
		name = name+alphabetUpper[randVar];
		
		if(name.charAt(i)!='A'||name.charAt(i)!='E'||name.charAt(i)!='O'
				||name.charAt(i)!='U'||name.charAt(i)!='I')
		{
			
			randVar = (int) (Math.random()*4)+0;
			name=name+vowelsLower[randVar];
		}
		
		if(name.startsWith("M"))
		{
			randVar = (int) (Math.random()*24)+0;
			
			if(randVar%3==0)
			{
			name=name+"ar";
			}
		}
		
		if(name.startsWith("O"))
		{
			name=name+"ri";
		}
		
		
		if(name.startsWith("A"))
		{
			randVar = (int) (Math.random()*24)+0;
			
			if(randVar%3==0)
			{
				name=name+"rnau";
			}
		}
		
		for(; i<nameSize;)
		{
			if(name.startsWith("Jo"))
			{
				name="Jea";
				i++;
			}
			
			if(name.startsWith("Pe"))
			{
				name="Pie";
			}
			
			if(name.startsWith("Ja"))
			{
				name="Jac";
				
				i++;
			}

			if(name.contains("u"))
			{
				name=name+"er";
				i=i+2;
			}
			
			if(name.contains("q"))
			{
				name=name+"ue";
				i=i+2;
			}
			
			if(name.contains("v")) 
			{
				if(randVar%3==0)
				{
				name=name+"el";
				i=i+2;
				}
			}
					
			
			
			if(name.contains("c"))
			{
				randVar = (int) (Math.random()*23)+0;
				
				if(randVar%3==0)
				{
					name=name+"he";
					i++;
				}
			}
			
			if(name.contains("a"))
			{
				randVar = (int) (Math.random()*23)+0;
				
				if(randVar%3==0)
				{
					name=name+"u";
				}
			}
			
			if(name.charAt(i)!='a'||name.charAt(i)!='e'||name.charAt(i)!='o'
					||name.charAt(i)!='u')
					
							
			{
				randVar = (int) (Math.random()*23)+0;
				
				if(randVar%1==0)
				{
				randVar = (int) (Math.random()*4)+0;
				name = name+vowelsLower[randVar];
				i++;
				}
				
				
			}
			
			randVar = (int) (Math.random()*23)+0;
			name = name+alphabetLow[randVar];
			i=i+2;
			
			
		}
		
		if(name.endsWith("a"))
		{
			if(randVar%2==0)
			{
				name=name+"nce";
			} else if(randVar%3==0)
			{
			name=name+"ine";
			} else if(randVar%4==0)
			{
				name=name+"nne";
			}
		}
		
		if(name.endsWith("l"))
		{
			name=name+"ine";
		}
		
		if(name.endsWith("r"))
		{
			randVar = (int) (Math.random()*23)+0;
			
			if(randVar%4==0)
			{
				name=name+"on";
			}
		}
		
		if(name.endsWith("i"))
		{
			randVar = (int) (Math.random()*23)+0;
			
			if(randVar%4==0)
			{
			name=name+"el";
			}
			
			if(randVar%3==0)
			{
			name=name+"lle";
			}
			
			if(randVar%5==0)
			{
			name=name+"en";
			}
			
			
			
		}
		
		if(name.endsWith("et"))
		{
			randVar = (int) (Math.random()*23)+0;

			
			
			name=name+"te";
			
		}
		
		if(name.endsWith("b"))
		{
			name=name+"ert";
		}
		
		if(name.endsWith("oi"))
		{
			name=name+"se";
		}
		
		if(name.endsWith("g"))
		{
			name=name+"ane";
		}
		
		
		
		if(name.endsWith("q")) {
			name=name+"ue";
		}
		
		
		if(name.endsWith("v"))
		{
			name=name+"eau";
		}
	
		
		System.out.println(name);
		
	}

	/**
	 * Drakhauf names start with so few letters because these are
	 * the primary starters for those in the dragon council
	 */
	private static void writeDrakhau() 
	{
		char[] alphabetLow = "adekfghizklnopkzrsktuvz".toCharArray();
		
		char[] vowelsLower ="aeiou".toCharArray();
		
		char[] vowelsUpper = "AEIOU".toCharArray();
		
		char[] alphabetUpper = "ADFKIOGRSN".toUpperCase().toCharArray();
		
		int randVar = (int) (Math.random()*9)+0;
		
		int i = 0;
		
		int nameSize = (int) (Math.random()*2)+4;
		
		String name="";
		
		name = name+alphabetUpper[randVar];
		
		
		if(name.startsWith("N"))
		{
			name=name+"ata";
			i=i+3;
		}
		
		if(name.startsWith("S"))
		{
			randVar = (int) (Math.random()*8)+0;
			
			if(randVar%2==0)
			{
			name=name+"trau";
			i=i+4;
			}else{
				name=name+"el";
				i++;
			}
		}
		
		if(name.startsWith("F")||name.startsWith("G"))
		{
			name=name+"ra";
			i++;
			i++;
		}
		
		if(name.startsWith("K"))
		{
			randVar = (int) (Math.random()*8)+0;
			
			if(randVar%2==0)
			{
			name=name+"laus";
			i=i+3;
			}else {
				name=name+"ryst";
				i=i+3;
			}
		}
		
		if(name.startsWith("I"))
		{
			randVar = (int) (Math.random()*8)+0;
			
			if(randVar%2==0)
			{
			name=name+"stau";
			i=i+4;
			}else {
				name=name+"sa";
				i++;
			}
		}
			
		
		if(name.startsWith("D"))
		{
			randVar = (int) (Math.random()*8)+0;
			
			if(randVar%2==0)
			{
			name=name+"rake";
			i=i+3;
			}else {
				name=name+"ani";
				i=i+2;
			}
		}
		
		if(name.startsWith("A"))
		{
			randVar = (int) (Math.random()*8)+0;
			
			if(randVar%2==0)
			{
			name=name+"brah";
			i=i+4;
			}else {
				name=name+"ga";
				i=i+2;
			}
		}
		
		if(name.startsWith("R"))
		{
			name=name+"as";
			i=i+2;
		}
		
		for(; i<nameSize;)
		{
			
			if(name.charAt(i)=='h'||(name.charAt(i)=='t'))
			{
				name=name+"au";
				i=i+2;
			}
			
			if(name.charAt(i)!='a'||name.charAt(i)!='e'||name.charAt(i)!='o'
					||name.charAt(i)!='u')
					
							
			{
				randVar = (int) (Math.random()*22)+0;
				
				if(randVar%1==0)
				{
				randVar = (int) (Math.random()*4)+0;
				name = name+vowelsLower[randVar];
				i++;
				}
				
				
			}
			
			randVar = (int) (Math.random()*22)+0;
			name = name+alphabetLow[randVar];
			i++;
			
			if(name.charAt(i)=='h')
			{
				randVar = (int) (Math.random()*22)+0;
				if(randVar%6==0)
				{
					name=name+"ans";
					i=i+3;
				}else {
					name=name+"a";
					i++;
				}
			}

			
			if(name.charAt(i)=='m')
			{
				name=name+"ur";
				i=i+2;
			}
			
			if(name.charAt(i)=='p')
			{
				name=name+"ru";
				i=i+2;
			}
			
			if(name.charAt(i)=='r')
			{
				name=name+"an";
				i=i+2;
			}
			
			if(name.charAt(i)=='z')
			{
				name=name+"al";
				i=i+2;
			}
			
			if(name.charAt(i)=='d')
			{
				name=name+"al";
				i=i+2;
			}
			
			if(name.charAt(i)=='k')
			{
				name=name+"a";
				i++;
			}
			
			if(name.charAt(i)=='o')
			{
				name=name+"la";
				i++;
			}
		}
		
		randVar = (int) (Math.random()*22)+0;
		if(randVar%2==0)
		{
			
			
		
		if(name.endsWith("s")&&!name.startsWith("Kl"))
		{
			randVar = (int) (Math.random()*22)+0;
			if(randVar%5==0)
			{
			name=name+"traus";
			}else {
				name=name+"se";
			}
			
		}
		
		if(name.endsWith("k"))
		{
			randVar = (int) (Math.random()*22)+0;
			if(randVar%5==0) {
				name=name+"o";
			}else {
				randVar = (int) (Math.random()*22)+0;
				if(randVar%5==0) {
				name=name+"enzie";
				}else {
					name=name+"enn";
				}
			}
		}
		
		
		if(name.endsWith("g"))
		{
			name=name+"au";
		}
		
		if(name.endsWith("l"))
		{
			
			randVar = (int) (Math.random()*22)+0;
			if(randVar%5==0)
			name=name+"aus";
		}
		
		
		
		if(name.endsWith("su"))
		{
			name=name+"schel";
			
		}
		
		if(name.endsWith("v"))
		{
			name=name+"a";
		}
	
		
		if(name.endsWith("a"))
		{
			randVar = (int) (Math.random()*22)+0;
			if(randVar%5==0) {
			name=name+"t";
			}else {
				name=name+"na";
			}
		}
		}
		System.out.println(name);
		
		
		

	}

	
	private static void writeNeu() 
	{
		char[] alphabetLow = "abcdefghiklmnoprstuvwxy".toCharArray();
		
		char[] vowelsLower ="aeiouy".toCharArray();
		
		char[] vowelsUpper = "AEIOUY".toCharArray();
		
		char[] alphabetUpper = "abcdefghiklmnoprstuvwxy".toUpperCase().toCharArray();
		
		int randVar = (int) (Math.random()*21)+0;
		
		int i = 0;
		
		int nameSize = (int) (Math.random()*1)+4;
		
		String name="";
		
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
		
	
		
		
		}
		
		System.out.println(name);

	}
	

}
