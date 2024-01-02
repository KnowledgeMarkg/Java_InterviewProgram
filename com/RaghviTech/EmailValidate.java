package com.RaghviTech;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {

	public static void main(String[] args) {
		String[] email = {
	      "user.example.com",
		  "invalid.email",
		  "another.user@domain.com",
		  "12345@gmail.com"	
		};
		
		for(String string : email) {
			boolean isvalid = validateEmail(string);
			System.out.println(string +"is valid: "+ isvalid);
		}
	}
	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
	private static boolean validateEmail(String email) {
		 if(email==null || email.isEmpty()) {
			 return false;
		 }
		 Pattern pattern = Pattern.compile(EMAIL_REGEX);
		 Matcher matcher = pattern.matcher(email);
		 
		 return matcher.matches();
	}

}
