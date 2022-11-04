package Binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinaryTraining {

	static int[] getArray() {
		int b[] = new int[10];
		int input_data = 0;
		Scanner in = new Scanner(System.in);
		
		for(int i = 0;i<b.length;i++) {
			System.out.print("Enter integer : ");
			input_data = in.nextInt();
			b[i] = input_data;
		}
		in.close();
		return b;
	}
	
	public static void main(String[] args) {
		int b[] = getArray();
		String path = new String("C:\\Users\\ches0\\Desktop\\JavaPrograming\\JavaClass20221104\\src\\Binary\\BinTest.bin");
		int c;
		try {
			FileOutputStream fout = new FileOutputStream(path);
			for(int i =0; i<b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		}
		catch (IOException e) {
			// TODO: handle exception
		}
		try {
			FileInputStream fin = new FileInputStream(path);
			for(int i =0;(c = fin.read())!= -1; i++) {
				System.out.println((int)c);
			}
			fin.close();
			
		}
		catch (IOException e) {
			
		}
	}

}
