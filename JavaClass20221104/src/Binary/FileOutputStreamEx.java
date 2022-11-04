package Binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\ches0\\Desktop\\JavaPrograming\\JavaClass20221104\\src\\Binary\\BinTest.bin");			
			fout.write(7);
			fout.write(51);
			fout.write(3);
			fout.close();
		}
		catch (IOException e) {
		
		}
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ches0\\Desktop\\JavaPrograming\\JavaClass20221104\\src\\Binary\\BinTest.bin");
			int c;
			for(int i =0;(c = fin.read())!= -1; i++) {
				System.out.println((int)c);
			}
			fin.close();
			
		}
		catch (IOException e) {
			
		}
		
	}

}
