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
		

		/*
		 * Establishing the connection
		 */
		try 
		{
			
			URL myURL = new URL("http://www.kultofathena.com/product.asp?item=AH6955F_ST&name=12th+Century+Holy+Land+Crusader+Sword+-+Stage+Combat+version");
			URLConnection myURLConnection = myURL.openConnection();
			myURLConnection.connect();
			InputStream is = myURLConnection.getInputStream();

			Document d = Jsoup.parse(myURL,3*10000);

			desc = d.body().text();
			
		//	System.out.println(desc);

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
