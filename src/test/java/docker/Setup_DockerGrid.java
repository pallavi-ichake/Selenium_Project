package docker;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.lang.Process;

public class Setup_DockerGrid {

	public Process p;
	 
	@BeforeTest
	void startDockergrid() throws IOException, InterruptedException
	{
	p =  Runtime.getRuntime().exec("cmd /c start dockerup.bat") ;           
	Thread.sleep(15000);
	}
		
	@AfterTest
	void stopDockergrid() throws IOException, InterruptedException
	{
	  Runtime.getRuntime().exec("cmd /c start dockerdown.bat"); 
      Thread.sleep(5000);
      Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ; //closes cmd's 
    }
}
