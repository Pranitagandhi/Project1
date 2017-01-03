import java.time.*;
import java.util.*;
public class DateTimeInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hour , minutes ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours and minutes :\n");
		hour = sc.nextInt();
		minutes = sc.nextInt();
		LocalDateTime dateTime = LocalDateTime.now().minusHours(hour).minusMinutes(minutes);  
	      System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());    
	      System.out.println("Difference : " + dateTime+"\n");    
sc.close();
	}

}
