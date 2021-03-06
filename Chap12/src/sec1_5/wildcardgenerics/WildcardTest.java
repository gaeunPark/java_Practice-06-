package sec1_5.wildcardgenerics;

public class WildcardTest {
	public static void registerCourese(Course<?> course) {}
	public static void registerCoureseStudent(Course<? extends Student> course) {}
	public static void registerCoureseWorker(Course<? super Student> course) {}
	
	public static void main(String[] args) {
		registerCourese(new Course<Person>("일반인 과정", 5));
		registerCourese(new Course<Student>("학생 과정", 5));
		registerCourese(new Course<Worker>("직장인 과정", 5));
		registerCourese(new Course<HighStudent>("고등학생 과정", 5));
		
//			Course<? extends Student>
//		registerCoureseStudent(new Course<Person>("일반인 과정", 5));
		registerCoureseStudent(new Course<Student>("학생 과정", 5));
//		registerCoureseStudent(new Course<Worker>("직장인 과정", 5));
		registerCoureseStudent(new Course<HighStudent>("고등학생 과정", 5));
		
//			Course<? super Student>
		registerCoureseWorker(new Course<Person>("일반인 과정", 5));
		registerCoureseWorker(new Course<Student>("학생 과정", 5));
//		registerCoureseWorker(new Course<Worker>("직장인 과정", 5));
//		registerCoureseWorker(new Course<HighStudent>("고등학생 과정", 5));
	}

}
