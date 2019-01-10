import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Community c = new Community();
		
		//System.out.println(c);
		
		Profile p = new Profile();
		
		//System.out.println(p);
		
		Scanner k = new Scanner(System.in);
		
		int g;
		g=0;
		
	Weapon w = new Weapon();
	
	//System.out.println(w.myDesc);
	System.out.println("**Character generated!**");
	for(int i = 0; i < 1;)
	{
	
	System.out.println("Press one of the following");
	System.out.println("1. Show all");
	System.out.println("2. Show character only");
	System.out.println("3. Show faith only");
	System.out.println("4. Show faction only");
	System.out.println("5. Show community only");
	g=k.nextInt();
	
	if(g==1)
	{
		p.toString();
	}
	
	if(g==2)
	{
		System.out.println("NAME: "+p.myName);
		System.out.println("AGE: "+p.myAge);
		System.out.println("GENDER: "+p.myGender);
		System.out.println("HUMOR: "+p.myHumour);
		System.out.println("JOB: "+p.myOccupation);
		System.out.println("POPULARITY: "+p.myPopularity);
		System.out.println("SO: "+p.mySO);
		System.out.println("QUIRKS: "+p.myQuirks[0]+", "+p.myQuirks[1]+", "+p.myQuirks[2]);
		System.out.println("BIRTHDAY: "+p.myBirth);
		System.out.println("SES: : "+p.mySES);
		
		for(int j = 0; j < 1;)
		{
			String gn;
			int gnn;
			System.out.println("Regenerate a stat? y / n");
			gn = k.next();
			if(gn=="y");
			{
				System.out.println("New what?");
				
				System.out.println("1. NAME: "+p.myName);
				System.out.println("2. AGE: "+p.myAge);
				System.out.println("3. GENDER: "+p.myGender);
				System.out.println("4. HUMOR: "+p.myHumour);
				System.out.println("5. JOB: "+p.myOccupation);
				System.out.println("6. POPULARITY: "+p.myPopularity);
				System.out.println("7. SO: "+p.mySO);
				System.out.println("8. QUIRKS: "+p.myQuirks[0]+", "+p.myQuirks[1]+", "+p.myQuirks[2]);
				System.out.println("9. BIRTHDAY: "+p.myBirth);
				System.out.println("10. SES: : "+p.mySES);
				
				gnn = k.nextInt();
				
				if(gnn==1)
				{
					p.myName=p.genNewName();
					System.out.println("NAME: "+p.myName);
				}
				
				if(gnn==2)
				{
					p.genNewAge();
					System.out.println("AGE: "+p.myAge);
				}
				
				if(gnn==3)
				{
					p.genNewGender();
					System.out.println("GENDER: "+p.myGender);
				}
				
				if(gnn==4)
				{
					p.genHumor();
					System.out.println("HUMOR: "+p.myHumour);
				}
				
				if(gnn==5)
				{
					p.genNewJob();
					System.out.println("JOB: "+p.myOccupation);
				}
				
				if(gnn==6)
				{
					p.genNewPopularity();
					System.out.println("POPULARITY: "+p.myPopularity);
				}
				
				if(gnn==7)
				{
					p.genNewSO();
					System.out.println("SO: "+p.mySO);
				}
				
				if(gnn==8)
				{
					p.genNewQuirks();
					System.out.println("QUIRKS: "+p.myQuirks[0]+", "+p.myQuirks[1]+", "+p.myQuirks[2] );
				}
				
				if(gnn==10)
				{
					p.genNewSES();
					System.out.println("SES: "+p.mySES);
				}
				
			}  if(gn=="n"){
				j=j++;
			}
			
			
		}
		
	}
	
	
	
	if(g==3)
	{
		System.out.println(p.myReligion);
	}
	
	if(g==4)
	{
		System.out.println(p.myFaction);
	}
	
	if(g==5)
	{
		System.out.println(p.myCommunity);
	}
	
	}

	
	
	}

}
