package simple;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Predicate;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-gen

		ZoneId ch = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(ch);
		System.out.println(dt);
	}
}
