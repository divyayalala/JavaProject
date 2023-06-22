package streamoffile;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileExample {
	public static void main(String[] args) {
		Path path = Paths.get("file1.txt");
		try {
			Stream<String> lines = Files.lines(path,Charset.forName("UTF-8"));
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

