package Sample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int start_count=0;
	int total=4;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(start_count<total)
		{
		start_count++;
		return true;
	}
		return false;
	}

}
