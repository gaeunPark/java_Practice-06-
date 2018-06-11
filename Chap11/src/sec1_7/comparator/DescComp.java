package sec1_7.comparator;

public class DescComp implements Comparator {

		public int compare(Object o1, Object o2) {
			if(!(o1 instanceof Integer)) 
				return -1;
			if(!(o2 instanceof Integer))
				return -1;
			Integer i1 = (Integer)o1;
			Integer i2 = (Integer)o2;
			return i1.compareTo(i2) * -1;
		}
	

}
