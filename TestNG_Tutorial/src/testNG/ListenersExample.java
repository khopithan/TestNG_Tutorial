package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {

	//to listen the test executions and performing actions based on listening
		// above 7 listeners
		// mainly...
		/*
		 * 1.suit listeners 2.test listeners 3.method listeners
		 */
	
	
	@Override		
    public void onFinish(ITestContext context) {					
        // TODO Auto-generated method stub	
		System.out.println("ater everything");
        		
    }		

    @Override		
    public void onStart(ITestContext context) {					
        // TODO Auto-generated method stub				
    	System.out.println("before everything");		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        // TODO Auto-generated method stub				
    	System.out.println("test is failed");		
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub	
    	System.out.println("test is skiped");	
        		
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
        // TODO Auto-generated method stub	
    	System.out.println("testcaseis going to execute");	
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
        // TODO Auto-generated method stub
    	System.out.println("test case is passed");	
        		
    }	
	

}
