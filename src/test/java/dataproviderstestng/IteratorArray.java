package dataproviderstestng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IteratorArray {
	@Test(dataProvider = "Metro")
	public void Train(String s) {
		System.out.println(s);
	}
	@DataProvider
	public Iterator<String> Metro() {
		List<String> bmtc= new ArrayList<>();
		bmtc.add("jeevan");
		bmtc.add("sringeri");
		return bmtc.iterator();
	}

}
