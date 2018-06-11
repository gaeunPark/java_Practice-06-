package sec2_10;

public class Product {
	static int count = 0;
	int serialNo = count;
	{
		++count;
		serialNo = count;
	}
	
}
