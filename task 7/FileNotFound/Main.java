package FileNotFound;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {



	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       File file=new File("Test.txt");
		 try {
			FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	}