
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		// Comparing string memory locations
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// Comparing string values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		String s4 = "hello";
		// Comparing different cases of strings
		System.out.println(s1.equalsIgnoreCase(s4));
		
		s1 = s1 + "World";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		System.out.println(s1.replace('o', 'a'));
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] days = week.split("-");
		for (String day : days) 
			System.out.println(day);
		
		// Write a logic to sort string array days.
		for (int i = 0; i < days.length - 1; i++) {
			for (int j = i+1; j < days.length; j++) {
				if(days[i].compareTo(days[j]) > 0) {
					String temp = days[i];
					days[i] = days[j];
					days[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted days..");
		for (String day : days) 
			System.out.println(day);
		
	}
}
