package dataproviderstestng;

import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedArray {
	@Test(dataProvider = "car")
	public void bike(Object[] bus) {
		//System.out.println(bus);
		
		for(int i=0;i<bus.length;i++){
			System.out.print(bus[i]+" ");
			
		}
		System.out.println();
		System.out.println("  "+"----");
		
	}
	@DataProvider
	public Object[] car() {
		Object[][] Bus=new Object[][]{
				{"raju","122","apple"},
				{"ram","192","orange"},
				{"rama","apple"},
				{"hanu","167","apple","23"},
		};
		return Bus;
				
	}

}
