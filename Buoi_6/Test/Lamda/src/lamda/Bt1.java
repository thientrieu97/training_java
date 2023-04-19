package lamda;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Bt1 implements Maneger {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(2);
		numbers.add(10);
		numbers.add(8);
		numbers.add(7);
		numbers.add(99);
		numbers.add(7);
		
		numbers.forEach((i) -> {System.out.println(i);} );
		
		//Stream API
		numbers.stream().forEach((i) -> {System.out.println(i+2);});
		checkAllMatch();
		
		//Method Reference
		List<Student> list = getStudents().stream()
				.filter(student -> student.getId() % 2 == 0)
				.collect(Collectors.toList());
		list.forEach(System.out::println);
		
		//default method chi viet trong interface
		
		//Type Annotation
		//một biến cụ thể trong chương trình của bạn không bao giờ được gán cho NULL
		//@NonNull @Size(max = 100) String str;
		
		
		
		//Java Refelection
		
		
		
		
	}
	
	public static void checkAllMatch()
	{
		List<Integer> number = Arrays.asList(11, 12, 23, 44, 57, 61, 72, 88);
		System.out.println("---------- Input -----------");
		System.out.println(number);
		if(number.stream().allMatch(t -> t > 10)) {
			System.out.println("tat ca lon hon 10");
		};
	}
	
	private static List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "A", "AB"));
		students.add(new Student(2, "B", "BC"));
		students.add(new Student(3, "C", "CD"));
		return students;
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
