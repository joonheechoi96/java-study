package chap13.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	Map<String, Member> memberMap = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		if (memberMap.containsKey(id)) {
			return false;
		} else {
			memberMap.put(id, m);
			return true;
		}
	}
	
	public String logIn (String id, String password) {
		if (!memberMap.containsKey(id)) {
			return null;
		} 
		
		if (!memberMap.get(id).getPassword().equals(password)) {
			return null;
		} else {
			return memberMap.get(id).getName();
		}
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if (!memberMap.containsKey(id)) {
			return false;
		} 
		
		if (!memberMap.get(id).getPassword().equals(oldPw)) {
			return false;
		} else {
			memberMap.get(id).setPassword(newPw);
			return true;
		}
	}
	
	public void changeName(String id, String newName) {
		memberMap.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> same = new TreeMap<>();
		Set<String> keySet = memberMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key =keyIterator.next();
			Member value = memberMap.get(key);
			if (value.getName().equals(name)) {
				same.put(key, name);
			} else {
				continue;
			}
		}	return same;
	}
}
