package sec1_1;

public class TvTest {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 0;
		t1.channel = 0;
		System.out.printf("t1�� channel���� %d�Դϴ�.\n", t1.channel);
		System.out.printf("t2�� channel���� %d�Դϴ�.\n", t2.channel);
		t1.channel = 7;
		System.out.printf("t1�� channel���� %d�� �����Ͽ����ϴ�.\n",t1.channel);
		System.out.printf("t1�� channel���� %d�Դϴ�.\n", t1.channel);
		System.out.printf("t2�� channel���� %d�Դϴ�.\n", t2.channel);
		
	}
}
