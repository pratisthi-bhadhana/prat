package Tngg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {
	
	public void onStart(ITestContext context)
	{
		System.out.println("On Start method " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finsh method" + context.getName());
	
}
	public void onTestFailure(ITestResult Result) {
		System.out.println("On Failure method" + Result.getName());
}
	
	public void onTestSkipped(ITestResult Result) {
		System.out.println("On skip method" + Result.getName());
}
	public void onTestSuccess(ITestResult Result) {
		System.out.println("On success method"+ Result.getName());
}
	public void onTestStart(ITestResult Result) {
		System.out.println("On start method"+ Result.getName());
}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
}
}