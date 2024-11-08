package dataproviderstestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Integerarray {
	@Test(dataProvider = "orange")
	public void apple(Integer mango) {
		System.out.println(mango);

	}

	@DataProvider
	public Integer[] orange() {
		Integer[] mango = new Integer[] { 1, 2, 3, 4 };
		return mango;

	}
}
