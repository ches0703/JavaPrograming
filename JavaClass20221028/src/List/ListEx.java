package List;
import java.util.*;
public class ListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<5;i++) {
			list.add(i*3);
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i));
		}
	}

}
