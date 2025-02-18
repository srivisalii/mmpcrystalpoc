package org.h2k.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class AppLibrary {
	
	public static String getFutureDate(String format,int d) 
	{

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,d);
		Date date = cal.getTime();
		System.out.println("Today's Date :" + date);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String formattedDate = sdf.format(date);
		System.out.println("formattedDate:: " + formattedDate);
		return formattedDate;	

	}
	public static int generateRandInteger()
	{
		Random rand = new Random();
		int randno  = 30+rand.nextInt(80-30);
		System.out.println("range::: "+ randno);
		return randno;
	}

	public static String generateRandString(String text)
	{
		Random rand = new Random();
		/**
		 * Random upper case character
		 */
		//Generate a random between 65 to 90 
		//randno = LB+rand.nextInt(UB-LB);
		int randno  = 65+rand.nextInt(90-65);
		System.out.println("range::: "+ randno);
		
		//type casting
		char upperCase = (char) randno;
		System.out.println("upper case char value :: "+ upperCase);
		
		
		/**
		 * Random lower case character
		 */
		//Generate a random number between 97 to 122
		randno = 97+rand.nextInt(122-97);
		char lowerCase = (char) randno;
		System.out.println("lower case char value::" + lowerCase);
		
		String randomString= text+upperCase+lowerCase;
		System.out.println("Random String::" +randomString );
		return randomString;
	
	  }
	
	
	public static String generateRandInlicense() {
		 
		Random rand = new Random();
		 int areali = rand.nextInt(100000000);
		 System.out.println("range::: "+ areali);
		// int groupsli = rand.nextInt(99);
		 //System.out.println("range::: "+ groupsli);
		 //int serialsli = rand.nextInt(999);
		 //System.out.println("range::: "+ serialsli);
		 //String licenseno=Integer.toString(areali)+Integer.toString(groupsli)+Integer.toString(serialsli);
		 String licenseno=Integer.toString(areali);
		 System.out.println("Concatenated license range ::: "+ licenseno);
	     return licenseno;
	     
	   }
	 
	public static String generateRandInSsn() {
		 
		 Random rand = new Random();
		 int area = rand.nextInt(999);
		 System.out.println("range::: "+ area);
		 int groups = rand.nextInt(99);
		 System.out.println("range::: "+ groups);
		 int serials = rand.nextInt(9999);
		 System.out.println("range::: "+ serials);
		 String randomnumbers=Integer.toString(area)+Integer.toString(groups)+Integer.toString(serials);
		 System.out.println("Concatenated range ::: "+ randomnumbers);
	     return randomnumbers;
	 }
	
public static String generateRandomCityState() {
		
		String randomCityState = "";
				
		// Create a sample city, state map
        Map<String, String> map = new HashMap<>();
        map.put("Chicago", "Illinois");
        map.put("Columbus", "Ohio");
        map.put("Boston", "Massachusets");
        map.put("Detroit", "Michigan");
        map.put("Austin", "Texas");
        map.put("Orlando", "Florida");

        // Convert the entry set to a list
        List<Map.Entry<String, String>> entryList = new ArrayList<>(map.entrySet());

        // Create a random number generator
        Random random = new Random();

        // Generate a random index
        int randomIndex = random.nextInt(entryList.size());

        // Get the random entry
        Map.Entry<String, String> randomEntry =  entryList.get(randomIndex);
        
        System.out.println("Random Key: City : " + randomEntry.getKey());
        System.out.println("Random Value: State : " + randomEntry.getValue());
        
        randomCityState = randomEntry.getKey() + "|" + randomEntry.getValue();
		 
	    return randomCityState;
	 }

public static String generateRandInaddress(String text) {
	 
	 Random rand = new Random();
	 int randnum = rand.nextInt(99);
	 System.out.println("range::: "+ randnum);
     int randno  = 65+rand.nextInt(90-65);
     randno = 97+rand.nextInt(122-97);
	 char lowerCase = (char) randno;
	 System.out.println("lower case char value::" + lowerCase);
	 
	 String randomString=Integer.toString(randnum)+lowerCase+text;
	 return randomString;

}

public static String generateRandIntZip() {
	 
	Random rand = new Random();
	int area = rand.nextInt(999);
	System.out.println("range::: "+ area);
	int groups = rand.nextInt(99);
	System.out.println("range::: "+ groups);
    String zipcodeno=Integer.toString(area)+Integer.toString(groups);
    System.out.println("zipcode::: "+ zipcodeno);
    return zipcodeno;
  }
//Integer.toString(ranzipnum)+Integer.toString(ranzipnum1);

public static String generateRandInheight() {
	 
	 Random rand = new Random();
	 int randnum = rand.nextInt(99);
    System.out.println("range::: "+ randnum);
    return Integer.toString(randnum);
}


public static String generateRandInweight() {
	 
	 Random rand = new Random();
	 int randnum = rand.nextInt(99);
   System.out.println("range::: "+ randnum);
   return Integer.toString(randnum);
}


public static String generateRandInEmail(String text) {
	 
	 Random rand = new Random();
	 int randno  = 65+rand.nextInt(90-65);
     randno = 97+rand.nextInt(122-97);
	 char lowerCase = (char) randno;
	 System.out.println("lower case char value::" + lowerCase);
	
	 String randomString=text+lowerCase+"@gmail.com";
	 return randomString;
	 
}

public static String generateRandPwd(String text)
{
	Random rand = new Random();
	/**
	 * Random upper case character
	 */
	//Generate a random between 65 to 90 
	//randno = LB+rand.nextInt(UB-LB);
	int randnum  = 30+rand.nextInt(80-30);
	System.out.println("range::: "+ randnum);
	
	int randno  = 65+rand.nextInt(90-65);
	System.out.println("range::: "+ randno);
	
	//type casting
	char upperCase = (char) randno;
	System.out.println("upper case char value :: "+ upperCase);
	
	
	/**
	 * Random lower case character
	 */
	//Generate a random number between 97 to 122
	randno = 97+rand.nextInt(122-97);
	char lowerCase = (char) randno;
	System.out.println("lower case char value::" + lowerCase);
	
	String randomString= text+Integer.toString(upperCase)+Integer.toString(lowerCase)+randnum;
	System.out.println("Random String::" +randomString );
	return randomString;

  }






}
