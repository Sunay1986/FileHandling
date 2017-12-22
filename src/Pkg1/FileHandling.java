package Pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("src\\abc.properties   "));
			System.out.println(p.getProperty("url"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
