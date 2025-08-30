package Day0407;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class time {
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);	
//		System.out.println("Enter the date of birth");
//		long timestampMillis = sc.nextLong(); // Example: before 1970
		long timestampMillis = -113981400000l;
		// Convert to Instant (epoch time in milliseconds)
		Instant instant = Instant.ofEpochMilli(timestampMillis);

		// Formatters
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

//		// UTC Time
//		ZonedDateTime utcTime = instant.atZone(ZoneId.of("UTC"));
//		System.out.println("UTC Time: " + formatter.format(utcTime));

		// IST Time
		ZonedDateTime istTime = instant.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println("IST Time: " + formatter.format(istTime));
	}
}

