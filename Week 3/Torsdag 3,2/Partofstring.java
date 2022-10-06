public class Partofstring{
	public static void main(String[] args) {
		
		String text = "cphbusiness";
		int indexstart = 0; 
		int amount = 6;

	   String result = Partofstring(text, indexstart, amount);
	   System.out.println(result);
	}

	public static String Partofstring(String text, int indexstart, int amount) {
	

		return((text.substring(indexstart, amount)));

	}



}



