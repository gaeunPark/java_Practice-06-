package exam12_5.wildcardgenerics;

public class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box){
		String tmp="";
		for(Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
	
	
}
