package TechM;

public class StaticCounter {
	static int counter=0;
	public StaticCounter() {
		counter++;
	}
	public void displayCount() {
		System.out.println(counter);
	}

}
