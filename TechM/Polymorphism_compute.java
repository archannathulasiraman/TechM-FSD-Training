package TechM;

public class Polymorphism_compute {
	public static void main(String[] args) {
		Polymorphism_calculate calculate=new Polymorphism_calculate();
		System.out.println(calculate.calculator(20,30));
		System.out.println(calculate.calculator(20.4,10.23,12.3));
	}

}
