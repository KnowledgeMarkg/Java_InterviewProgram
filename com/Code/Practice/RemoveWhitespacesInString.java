package com.Code.Practice;

public class RemoveWhitespacesInString {

	public static void main(String[] args) {
		String string = "  ja   va   s t a   r";
		
		// 1st approach
		 String string3 = string.replaceAll("\\s+", "");
		 System.out.println("1st approach "+ string3);
		
		 //2nd approach
		String string2= StringremoveSpace(string);
		System.out.println(string+" = " +string2);
		
	}

	private static String StringremoveSpace(String string) {
		StringBuffer sBuffer = new StringBuffer();
		for(char ch : string.toCharArray()) {
			if(ch==' ') {
				continue;
			}
			else {
				sBuffer.append(ch);
			}
		}
		return sBuffer.toString();
	}

}
