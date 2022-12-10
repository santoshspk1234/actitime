package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("./data/Commondata.property");
		Properties p=new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		System.out.println(url);
		
		String un=p.getProperty("username");
		System.out.println(un);
		
		String pw=p.getProperty("password");
		System.out.println(pw);
	}

}
