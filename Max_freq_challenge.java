package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Max_freq_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n= s.nextInt();
int [] arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
HashMap<Integer,Integer> map= new HashMap<>();
for(int i=0; i<arr.length;i++) {
	int cc= arr[i];
	if(map.containsKey(cc)) {
		int ov= map.get(cc);
		ov=ov+1;
		map.put(cc,ov);
	}
	else {
		map.put(cc,1);
	}
}
Set <Map.Entry<Integer,Integer>> entries= map.entrySet();
int maxval=0;
int maxfreq=0;
for(Map.Entry<Integer, Integer> entry:entries) {
	if(entry.getValue()>maxfreq) {
		maxval=entry.getKey();
		maxfreq=entry.getValue();
	}
}
System.out.println(maxval);
	}

}
