package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class OneFourteen {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter Zone Id :");
	    String str = br.readLine();
	    ZonedDateTime now = ZonedDateTime.now(ZoneId.of(str));
	    System.out.println("Time :"+now);
	}

}
