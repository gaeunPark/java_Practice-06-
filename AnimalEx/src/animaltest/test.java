package animaltest;
import animal.*;

public class test {
	public static void main(String[] args) {
		animal[] a= { new dog("마크", "치와와"),
				new cat("나비", 5),
				new cat("별이", 3),
				new dog("해피", "말티즈")
		};
		
		for(animal i : a) {
			i.introduce();
		}
		
		
		
		
		
		
		
	}

}
