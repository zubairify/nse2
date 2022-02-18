
public class CmdLineDemo {

	public static void main(String[] args) {
		int total = 0;
		for (String a : args) 
			total += Integer.parseInt(a);
		
		System.out.println("Total: " + total);
		
	}
}
