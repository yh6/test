package p14_Extra;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam<K, V> extends HashMap<K, V> {
	ArrayList<K> al = new ArrayList<K>();
	
	MapExam(){		
	}
	
	
	@Override
	public V put(K key, V Value) {
		if(al.indexOf(key) == -1) {
			al.add(key);			
		}
		
		return super.put(key, Value);
		
	}
	
	@Override
	public V remove(Object key) {
		
		int idx = al.indexOf(key);
		al.remove(idx);		
		return super.remove(key);
		
	}
	
	
	@Override
	public String toString() {
		String str = "{" ;
		for(K k : al) {
			str += k + "=" + this.get(k) + "," ;
			
		}
		
		return str.substring(0, str.length()-1) + "}" ;	
		
	}
	

}
