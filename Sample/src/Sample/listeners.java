package Sample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{

	@Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("On Finish");
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("On Start");
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("onTestFailedButWithinSuccessPercentage");
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("OnTestFailure");
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("OnTestSkipped");
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("OnTestStart");
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("OnTestSuccess");
    }		
}
