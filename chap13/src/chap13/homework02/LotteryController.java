package chap13.homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {
	
	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		if (win.contains(l)) {
			win.remove(l);
			lottery.remove(l);
			List<Lottery> lotteryList = new ArrayList<>(lottery);
			do {
			int rand = (int) (Math.random()*lotteryList.size());
			if (win.contains(lotteryList.get(rand))) {
				continue;
			} else {
				win.add(lotteryList.get(rand));
			}
			} while (false);
		}
		return lottery.remove(l);	
	}
	
	public Set<Lottery> serachObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject() {
		win.clear();
		if (lottery.size() < 4) {
			return null;
		}	else {
		List<Lottery> lotteryList = new ArrayList<>(lottery);
		
		while (win.size() < 4) {
			int rand = (int) (Math.random()*lotteryList.size());
			if (win.contains(lotteryList.get(rand))) {
				continue;
			} else {
				win.add(lotteryList.get(rand));
			}
		}
	}		return win;
	}
	
	public Set<Lottery> sortedWinObject() {
		List<Lottery> lotteryList = new ArrayList<Lottery>(win);
		Collections.sort(lotteryList);
		Set<Lottery> sortedSet = new LinkedHashSet<Lottery>(lotteryList);
		return sortedSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return (win.contains(l)) ? true : false ;
	}
}
