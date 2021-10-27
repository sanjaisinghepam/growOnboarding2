package jsonpathexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.jayway.jsonpath.JsonPath;

public class JsonPathExecuteClass {

	public static void main(String[] args) throws FileNotFoundException {
		 
		 FileReader fr = new FileReader("C:\\Users\\Sanjai_Singh\\eclipse-workspace\\newJoineeOnboarding\\books.json");
		 
		 String author = JsonPath.parse(fr).read("$.store.book[0].author");
		 
		 System.out.println(author);
		

	}

}
