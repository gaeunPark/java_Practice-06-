package sec1_7.comparator;

public class Student implements Comparable {
		int score;
		String name;
		Student(int score, String name){
			this.score = score;
			this.name = name;
		}
		
		@Override
		public int compareTo(Object obj) {
			Student s2 = (Student) obj;
			return this.score -s2.score;
		}
		


}
