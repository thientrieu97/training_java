package patternmatching;

public class Testpatternmatching {

	public static void main(String[] args) {
		
		//cach 1
		Object object1 = " ";
		if (object1 instanceof String);
		var string1 = (String) object1;
		System.out.println(string1);
		
		//cach2
		Object object2 = " ";
		if (object2 instanceof String string2) {
			System.out.println(string2);
		}
	}

}
