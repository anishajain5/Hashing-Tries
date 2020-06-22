package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class Intersection_of_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] one= new int[n];
		int [] two= new int[n];
for(int i=0;i<one.length;i++) {
	one[i]=s.nextInt();
}
for(int i=0;i<two.length;i++) {
	two[i]=s.nextInt();
}
System.out.println(getIntersection(one, two));
	}
	public static ArrayList getIntersection(int [] one, int [] two) {
		HashMap<Integer,Boolean> map= new HashMap<>();
		for(int i=0; i<one.length;i++ ) {
			map.put(one[i],false);
		}
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0; i<two.length;i++) {
			if(map.containsKey(two[i])) {
				list.add(two[i]);
			}
		}
		Collections.sort(list);
		return list;
	}

}
