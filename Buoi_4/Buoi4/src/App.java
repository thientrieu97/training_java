public class App {

    public static void main(String[] args) {

    //Bộ nhớ chiếm trong String    
    long m0 = Runtime.getRuntime().freeMemory();
    String s = new String("Hello Word");

    for(int i = 0 ; i < 1000 ; i++){
        s = s + "Hello Word";
    }
    
    long m1 = Runtime.getRuntime().freeMemory();
    System.out.println(m0 - m1);

    //Bộ nhớ chiếm trong StringBuilder  
    long m2 = Runtime.getRuntime().freeMemory();
    StringBuilder a = new StringBuilder("Hello Word");

    for(int i = 0 ; i < 1000 ; i++){
        a.append("Hello Word");
    }

    long m3 = Runtime.getRuntime().freeMemory();
    System.out.println(m2 - m3);

    //performance in String
    long startTime1 = System.nanoTime();
    
        String b = "Hello Word";

    long stopTime1 = System.nanoTime();
    System.out.println(stopTime1 - startTime1);

    //performance in StringBuilder
    long startTime2 = System.nanoTime();
    StringBuilder c = new StringBuilder();
        c.append("Hello Word");
    long stopTime2 = System.nanoTime();
    System.out.println(stopTime2 - startTime2);

    //Kiểm chứng biến tham trị
    int d = 20;
    System.out.println(d);

    //Kiểm chứng biến tham chiếu

    Animal animal = new Animal("Cat", 2);
    System.out.println(animal);



}
}
