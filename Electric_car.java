package TechM;

public class Electric_car extends Car {
	
	    public Electric_car(String make, String model, int year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

		private int batteryRange;

	    public Electric_car(String make, String model, int year, int batteryRange) {
	        super(make, model, year);
	        this.batteryRange = batteryRange;
	    }

	    public int getBatteryRange() {
	        return batteryRange;
	    }

	    public void setBatteryRange(int batteryRange) {
	        this.batteryRange = batteryRange;
	    }

	    @Override
	    public void startEngine() {
	        System.out.println("The electric engine has started silently.");
	    }

	    public void chargeBattery() {
	        System.out.println("The battery is being charged.");
	    }
	
	    public static void main(String[] args) {
	        Car[] cars = {
	            new Car("Toyota", "Camry", 2022),
	            new Electric_car("Tesla", "Model 3", 2023, 300)
	        };

	        for (Car car : cars) {
	            car.startEngine();
	        }
	    }
}


