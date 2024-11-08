package dataproviderstestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndicesDataProvider {
	@Test(dataProvider = "dog")
	public void cat(Object[] cow) {
	  System.out.println(cow);
		
	}
	
	/*Indices are nothing but indexes */
	
	@DataProvider(indices = {0,3})//in the array we store the data values. On the bsises of dataprovider we provide the data to the 
	                              //method on the help  of indices we provide the specific value on the basisces of array index.
	public Object[] dog() {
		Object[] cow=new Object[]
				{"cow","dog","monkey","rabbit"};
		return cow;
				
	}

}
