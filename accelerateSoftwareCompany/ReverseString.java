package accelerateSoftwareCompany;

public class ReverseString {

	public static void main(String[] args) {
		String str = "How are you?";
		String[] strArr  =  str.split(" ");
		reverseString(strArr);
	}

	private static void reverseString(String[] strArr) {
		for(String str : strArr) {
			for(int i = str.length()-1 ; i>=0 ; i--) {
				System.out.print(str.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
