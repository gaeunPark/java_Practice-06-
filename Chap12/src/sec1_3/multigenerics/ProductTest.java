package sec1_3.multigenerics;

public class ProductTest {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		
		product1.setModel("smart Tv");
		product1.setKind(new Tv());
		String tvModel = product1.getModel();
		Tv tv = product1.getKind();
		
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setModel("µðÁ©Â÷");
		product2.setKind(new Car());
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(carModel);
		
	}

}
