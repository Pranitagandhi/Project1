import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDiff {

	public static void main(String[] args) {

		try {
			final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
			final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter date 1 in (dd mm yyyy) format :");
			final String firstInput = reader.readLine();
			System.out.println("Enter date 2 in (dd mm yyyy) format :");
			final String secondInput = reader.readLine();
			final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
			final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
			final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
			final long months = ChronoUnit.MONTHS.between(firstDate, secondDate);
			final long years = ChronoUnit.YEARS.between(firstDate, secondDate);
			System.out.println("Days between: " + days);
			System.out.println("Months between: " + months);
			System.out.println("Years between: " + years);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
