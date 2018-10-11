package dataProv;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGXMLTest {
  @Test(dataProvider="dp")
  public void test_add(int a, int b) {
	  
	  Utils u = new Utils();
	  Assert.assertEquals(a+b, u.add(a, b), "Both are equal");
  }
  
  @Test(dataProvider="dpname", groups="setName")
  public void test_show(String text){
	  Utils.show(text);
	  Assert.assertEquals(text, Utils.Name);
  }
  @Test
	@Parameters("name1")
	public void test_name(@Optional("NA") String s) {
		System.out.println("Input parameter = "+s);
}
  
  @DataProvider
  public Object[][] dp(){
	  return new Object[][]{new Object[]{1,1}, new Object[]{2,2}};
  }
  @DataProvider
  public Object[][] dpname(){
	  return new Object[][]{new Object[]{"first"}};
  }
}
