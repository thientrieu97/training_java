package textblocks;

public class TestTextBlocks {

	public static void main(String[] args) {
		
		//cach 1
		String demo1 = "Hoang Phuc International"
				+ "\n"
				+ "kafak\n"
				+ "kafak\n";
		
		System.out.println(demo1);
		
		//Cach 2
		String demo2 = """
				Hoang Phuc International
				kafak
				kafak
				""";
		
		System.out.println(demo2);
	}

}
