package Tngg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class tng2 {
	
	//@Test(description=" This is tc1")
	//@Test(priority=0)
	//@Test(dependsOnMethods= {"testcase2"})
	@Test
	public void testcase1()
	{

		System.out.println("Mobile Login");
	}

//@Test(description = "This is tc2")
	//@Test(timeOut=200)
//@Test(priority=2)
	@Test(enabled=false)
public void testcase2()
{
		//try {
			//Thread.sleep(400);
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
	System.out.println("Web login");
	Assert.assertTrue(false);
}


//@Test(description = "This is tc3")
//@Test (priority=1)
@Test
public void testcase3()
{
	System.out.println("Api login");
}
}



