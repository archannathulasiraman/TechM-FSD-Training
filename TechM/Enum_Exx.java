package TechM;

public class Enum_Exx {

	    // Method to check if the day is a holiday
	    public static void checkHoliday(DaysOfWeek day) {
	        if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
	            System.out.println(day + ": Holiday");
	        } else {
	            System.out.println(day + ": Not Holiday");
	        }
	    }

	    public static void main(String[] args) {
	        // Testing the checkHoliday method with different days
	        checkHoliday(DaysOfWeek.MONDAY);    // Outputs: MONDAY: Not Holiday
	        checkHoliday(DaysOfWeek.SUNDAY);    // Outputs: SUNDAY: Holiday
	        checkHoliday(DaysOfWeek.WEDNESDAY); // Outputs: WEDNESDAY: Not Holiday
	        checkHoliday(DaysOfWeek.SATURDAY);  // Outputs: SATURDAY: Holiday
	    }
	}


