package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidator {
	
	public static boolean emailCheck(String email) {
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();

	}
	
	public static boolean customerCheck(String firstName , String lastName) {
		
		if(firstName.length()>=2 && lastName.length()>=2) {
			
			return true;
		}
			
		return false;
	}
	
	public static boolean passowordCheck(String passoword) {
		
		if(passoword.length()>=6){
			return true;
		}
		return false;
	}
}
