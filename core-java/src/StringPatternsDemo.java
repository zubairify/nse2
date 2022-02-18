
public class StringPatternsDemo {

	public static void main(String[] args) {
		String name = "Zubair";
		String namePattern = "[A-Z]{1}[a-z]{4,}";	// [A-Z][a-z]{4,}
		System.out.println(name.matches(namePattern)?"Valid":"Invalid");
		
		String mobile = "7458329438";
		String mobilePattern = "[7-9][0-9]{9}";
		
		String card = "4354346576562312";
		String cardPattern = "[0-9]{16}";
		
		String email = "zubair@gmail.com";
		String emailPattern = "[A-Za-z0-9+_.]+@[a-z0-9.]+[a-z]{2,}";
		
	}
}
