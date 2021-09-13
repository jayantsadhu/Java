package FirstOne1;
import java.util.*;
public class DooBee {
public static void main (String[] args) {
	int x = 1;
	while (x < 3) {
			System.out.print("Doo");
			System.out.print("Bee");
			x = x + 1;
			}
	if (x ==3) {
		System.out.print("Do");
		}
	
	
	ArrayList<Integer> array = new ArrayList<Integer>();
	array.add(10);
	array.add(30);
	array.add(20);
	Collections.sort(array);
	System.out.println(array);
	
	}
}
