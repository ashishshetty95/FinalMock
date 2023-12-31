package practice;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadDataFromJsonTest {
@Test
	public void main(String[] args) throws IOException, ParseException {
		FileReader fread=new FileReader(".\\src\\test\\resources\\Jsonread.json");
		JSONParser json=new JSONParser();
		Object obj = json.parse(fread);
		JSONObject map=(JSONObject) obj;
		System.out.println(map.get("browser"));
	}

}
