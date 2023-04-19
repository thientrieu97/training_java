package sealedclass;

public class TestSealedClass {

	public static void main(String[] args) {
		
		
		Dog a = new Dog();
		a.run();
		
		}

	}

final class Dog implements ITestSealedClass{

	@Override
	public void run() {
		System.out.println("run");
	}
}

//Chuong trinh se bi loi
//final class Cat implements ITestSealedClass{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}}

