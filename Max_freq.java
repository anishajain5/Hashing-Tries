package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Max_freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbccc";
		HashMap<Character,Integer> map= new HashMap<>();
		for(int i=0; i<str.length();i++) {
			char cc= str.charAt(i);
			if(map.containsKey(cc)) {
				int ov= map.get(cc);
				ov=ov+1;
				map.put(cc,ov);
			}
			else {
				map.put(cc,1);
			}
		}
		Set <Map.Entry<Character,Integer>> entries= map.entrySet();
		char maxchar='\0';
		int maxfreq=0;
		for(Map.Entry<Character, Integer> entry:entries) {
			if(entry.getValue()>maxfreq) {
				maxchar=entry.getKey();
				maxfreq=entry.getValue();
			}
		}
		System.out.println(maxchar);
		System.out.println(maxfreq);
		

	}

}
