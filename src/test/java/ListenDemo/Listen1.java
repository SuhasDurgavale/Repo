package ListenDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("succuess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skip");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finish");
	}

}
