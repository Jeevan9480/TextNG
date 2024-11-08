package dataproviderstestng;

import org.testng.annotations.DataProvider;

import net.bytebuddy.asm.Advice.Return;

public class DataProviderClass {
	@DataProvider
	public Object[] lion() {
		Object[] elefant=new Object[]
				{"rat","mat","cat","bat"};
		
		return elefant;
	}

}
