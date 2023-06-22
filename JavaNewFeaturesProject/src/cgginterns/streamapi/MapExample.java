package cgginterns.streamapi;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<String> uris = new ArrayList<String>();
		uris.add("c:\\MyFile1.txt");
		uris.add("c:\\MyFile2.txt");
		uris.add("c:\\MyFile3.txt");
		uris.add("c:\\MyFile4.txt");
		
		Stream<Path> map = uris.stream().map(uri->Paths.get(uri));
		map.forEach(System.out::println);
		System.out.println("--------------------------");
		List<Detail> details = new ArrayList<Detail>();
		List<String> parts1 = new ArrayList<String>();
		parts1.add("parts_1");
		parts1.add("parts_2");
		parts1.add("parts_3");
		parts1.add("parts_4");
		List<String> parts2 = new ArrayList<String>();
		parts2.add("parts_1");
		parts2.add("parts_1");
		parts2.add("parts_1");
		Detail detail1 = new Detail(1001,parts1);
		Detail  detail2 = new Detail(1002,parts2);
		details.add(detail1);
		details.add(detail2);
		Stream<String> flatMapstream = details.stream().flatMap(d->d.getParts().stream());
		flatMapstream.forEach(System.out::println);
		
	}

}
