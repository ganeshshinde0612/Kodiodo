package kodiodo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Map<String, List<String>> map = new HashMap<>();
		
		List<String> al = new ArrayList<>();
		al.add("amar");
		al.add("umesh");
		al.add("ramesh");
		
		
		List<String> list = new ArrayList<>();
		list.add("prashant");
		list.add("pravin");
		list.add("piyush");
				
		map.put("IT",al);
		map.put("HR", list);
		Set<String> key = map.keySet();
		for(String s:key)
		{
//			System.out.println(s);
			List<String> itr = map.get(s);
			for(String m: itr)
			{
//				System.out.println(m);
				System.out.println("Department "+s+" employee "+m);
			}
		}
		
	}
}
