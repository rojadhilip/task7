package String;

public class Main {

	public static void main(String[] args) {
		// String index out of boundary- unchecked exception
		try {
			String word="roja";
			System.out.println("word.charAt(24)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("String index out of boundary exception..");
		}

	}

}
