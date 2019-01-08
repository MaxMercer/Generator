import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Weapon 
{
	
	String myDesc;
	
	Weapon()
	{
		
		
	 myDesc = genWep();

		
		
		
	}

	private String genWep() {
		
		String desc = null;
		
		Random r = new Random();
		
		int var = r.nextInt(15);
		
		URL myURL = null;
		
		/*
		 * Establishing the connection
		 */
		try 
		{
			
			if(var == 1)
			{
				 myURL = new URL("http://www.kultofathena.com/product.asp?item=AH6955F_ST&name=12th+Century+Holy+Land+Crusader+Sword+-+Stage+Combat+version");
			}
			
			if(var == 2)
			{
				 myURL = new URL("http://www.kultofathena.com/product.asp?item=SM36050&name=13th+Century+Arming+Sword+-+Atrim+Design+-+Type+XIV");
			}
			
			if(var == 3)
			{
				 myURL = new URL("http://www.kultofathena.com/product.asp?item=ANH15&name=Albion+Agincourt+Sword");
			}
			
			if(var == 4)
			{
				 myURL = new URL("http://www.kultofathena.com/product.asp?item=ANS5&name=Albion+Caithness+Sword");
			}
			
			if(var == 5)
			{
				 myURL = new URL("http://www.kultofathena.com/product.asp?item=ANS6&name=Albion+Laird+Sword");
			}
			
			if(var == 6)
			{
				 myURL = new URL("http://www.kultofathena.com/product.asp?item=ANS23&name=Albion+Machiavelli+Sword");
			}
			
			if(var == 7)
			{
				 myURL = new URL("http://www.kultofathena.com/product.asp?item=AA034&name=Arms+%26+Armor+Black+Prince+Sword");
			}
			
			if(var == 8)
			{
				myURL = new URL("http://www.kultofathena.com/product.asp?item=BKS18A016&name=BKS+Gothic+Bastard+Sword");
			}
			
			if(var == 9)
			{
				myURL = new URL("http://www.kultofathena.com/product.asp?item=600624&name=16th+Century+Italian+Mace");
			}
			
			if(var == 10)
			{
				myURL = new URL("http://www.kultofathena.com/product.asp?item=AA193&name=Arms+%26+Armor+High+Gothic+Mace");
			}
			
			if(var == 11)
			{
				myURL = new URL("http://www.kultofathena.com/product.asp?item=CS90MFLM&name=Cold+Steel+-+Man+At+Arms+Collection+-+Gothic+Mace");
			}
			
			if(var == 12)
			{
				myURL = new URL("http://www.kultofathena.com/product.asp?item=FA41&name=Fabri+Armorum+Flanged+Mace");
			}
			
			if(var == 13)
			{
				myURL = new URL("http://www.kultofathena.com/product.asp?item=APW44&name=Flanged-Headed+Mace");
			}
			
			if(var == 14)
			{
				myURL = new URL("http://www.kultofathena.com/product.asp?item=600853&name=German+Mace");
			}
			
			
			URLConnection myURLConnection = myURL.openConnection();
			myURLConnection.connect();
			InputStream is = myURLConnection.getInputStream();

			Document d = Jsoup.parse(myURL,3*10000);

			desc = d.body().text();
			
			System.out.println(myURL);

			return desc;
			
		}
		catch(MalformedURLException f)
		{
			f.printStackTrace();
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
		return desc;
	}

}
