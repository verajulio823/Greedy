import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Maximum Salary
		 * */
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(2);
		isBetter(3, list);
		
		list.clear();
		list.add(9); list.add(4); list.add(6); list.add(1); list.add(9);
		isBetter(5,list);
		
		list.clear();
		list.add(23); list.add(39); list.add(92);
		isBetter(3, list);
		
		list.clear();
		list.add(19); list.add(14); list.add(36); list.add(19); list.add(9);
		isBetter(5,list);
		
		list.clear();
		list.add(48); list.add(25); list.add(32); list.add(98); 
		isBetter(4,list);
		
		/**
		 * Collecting Signatures
		 * */
		
		List<Pair> listPair = new ArrayList<Pair>();
		listPair.add(new Pair(1,3));
		listPair.add(new Pair(2,5));
		listPair.add(new Pair(3,6));
		
		nsegments(listPair);
		
		listPair.clear();
		listPair.add(new Pair(4,7));
		listPair.add(new Pair(1,3));
		listPair.add(new Pair(2,5));
		listPair.add(new Pair(5,6));
		
		nsegments(listPair);
		
		listPair.clear();
		listPair.add(new Pair(2,4));
		listPair.add(new Pair(3,5));
		listPair.add(new Pair(6,7));
		
		
		nsegments(listPair);
		
	}
	
	
	static void isBetter(int number, List<Integer> maxNumber) {
		
	
		Collections.sort(maxNumber, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				
				return Integer.parseInt(o1+""+o2)- Integer.parseInt(o2+""+o1);
				
			}
		});
		Collections.reverse(maxNumber);
		String maxSalary="";
		for(Integer i: maxNumber) {
			maxSalary+=i+"";
		}
		System.out.println(maxSalary);
		
	
		
	}
	
	
	static void nsegments(List<Pair> segments) {
		Collections.sort(segments, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.end-o2.end;
			}
			
		});
		
		List<Integer> listPoints = new ArrayList<Integer>();
		Integer currentPoint= segments.get(0).end;
		listPoints.add(currentPoint);
		
		for(int i=1; i< segments.size(); i++) {
			if(currentPoint < segments.get(i).start || currentPoint > segments.get(i).end) {
				currentPoint = segments.get(i).end;
				listPoints.add(currentPoint);
			}
		}
		System.out.println(listPoints);
		
	}
	
	public static class Pair{
		int start;
		int end;
		
		public Pair(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
	}
}
