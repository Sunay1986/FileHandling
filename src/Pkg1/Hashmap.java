package Pkg1;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashmap
		HashMap<String, Object> hm= new HashMap<String,Object>();
		hm.put("url", "http://www.magneto.com");
		hm.put("Name",200);

		System.out.println(hm.get("url"));
		System.out.println(hm.get("Name"));
		System.out.println(hm.containsKey("abc"));
		
		//Array list of object for hashmap
		HashMap<String,ArrayList<Object>> hmo =new HashMap<String,ArrayList<Object>> ();
		ArrayList<Object> o= new ArrayList<Object>();
		o.add(10);
		o.add("google.com");
		o.add('a');
		o.add(40);
		
		hmo.put("Array", o);
		
		System.out.println(hmo.get("Array").get(1).toString());
		System.out.println(1+(int) hmo.get("Array").get(0));
		System.out.println(hmo.get("Array"));
		
	}

}
