package sec1_5.wildcardgenerics;

import java.util.Arrays;

public class WilecardTest2 {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Student> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
//		workerCourse.add(new Person("일반인"));
		workerCourse.add(new Worker("직장인"));
//		workerCourse.add(new Student("학생"));
//		workerCourse.add(new HighStudent("고등학생"));
		
		Course<Student> StudentCourse = new Course<>("학생 과정", 5);
//		StudentCourse.add(new Person("일반인"));
//		StudentCourse.add(new Worker("직장인"));
		StudentCourse.add(new Student("학생"));
		StudentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> HighStudentCourse = new Course<>("고등학생 과정", 5);
//		HighStudentCourse.add(new Person("일반인"));
//		HighStudentCourse.add(new Worker("직장인"));
//		HighStudentCourse.add(new Student("학생"));
		HighStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(StudentCourse);
		registerCourse(HighStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(StudentCourse);
		registerCourseStudent(HighStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
//		registerCourseWorker(workerCourse);
		registerCourseWorker(StudentCourse);
//		registerCourseWorker(HighStudentCourse);
		System.out.println();
		
		
		
		
	}

}
