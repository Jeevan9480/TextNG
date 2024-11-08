package dataproviderstestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Singlestring {
	@Test(dataProvider = "setup")
	public void set(String s) {
		System.out.println(s);

	}

	@DataProvider
	public String[] setup() {
		String[] sam = new String[] { "jeev", "van", "apple" };
		return sam;

	}

}
