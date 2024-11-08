package dataproviderstestng;

import org.testng.annotations.Test;

public class DataReciver {
	@Test(dataProvider = "lion",dataProviderClass = DataProviderClass.class)
	public void tiger(Object lion[] ) {
		System.out.println(lion);
	}

}
