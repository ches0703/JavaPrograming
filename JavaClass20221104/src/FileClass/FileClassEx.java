package FileClass;
import java.io.File;

public class FileClassEx {

	public static void main(String[] args) {
		File f = new File("c:\\\\windows\\\\system.ini");
		
		if(f.isFile()) {
			System.out.println(" f is File");
		}
		else if(f.isDirectory()) {
			System.out.println(" f is Dir");
		}
		
		System.out.println("File name : " + f.getName());	
		System.out.println("File Path : " + f.getPath());
		System.out.println("File Parent : " + f.getParent());
		
		
		
	}

}
