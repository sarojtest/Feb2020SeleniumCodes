package seleniumsessions;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class TwistSolve {

	static HashMap<String, String> countryCapitalMap = new HashMap<String, String>();
	
	static ArrayList<String> allCountries = new ArrayList<String>();
	static ArrayList<String> allCapitals = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String outputCapital = "";
		System.out.println("Enter a country name and I will tell you its capital city.");
		System.out.println("Enter a country name");
		
		//Now create a local database first dude
		countryCapitalMap.put("India", "Delhi");
		countryCapitalMap.put("Japan", "Tokyo");
		countryCapitalMap.put("China", "Beijing");
		countryCapitalMap.put("Thailand", "Bangkok");
		
		
		
		String inputCountry = sc.next();
		//india
		
		
		//inputCountry = inputCountry;
		if(countryCapitalMap.containsKey(inputCountry)) {
			//outputCapital = countryCapitalMap.get(inputCountry).toString();
			outputCapital = countryCapitalMap.get(inputCountry);
			System.out.println("The capital of "+inputCountry+" is "+outputCapital);
		}else {
			System.out.println("No record found for "+inputCountry+"...");
		}
	}

}
