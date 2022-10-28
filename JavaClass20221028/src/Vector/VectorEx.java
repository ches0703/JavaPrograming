package Vector;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	
	static void getVector(Vector v) {
		Scanner in = new Scanner(System.in);
		for(;;) {
			System.out.print("Enter value( -1 is End ) : ");
			int get_value = in.nextInt();
			if(get_value==-1) {
				break;
			}
			v.add(get_value);
		}
		in.close();
	}
	
	static int returnMaxValue(Vector v) {
		int max_value = (int) v.get(0);
		Iterator<Integer> it = v.iterator();
		for(;it.hasNext();) {
			int next_value = (int)it.next();
			if(max_value < next_value) {
				max_value = next_value;
			}
		}
		return max_value;
	}

	public static void main(String[] args) {
		
		var v = new Vector<Integer>();
		getVector(v);
		System.out.println("Max Value : "+returnMaxValue(v));
		
		
	}

}
