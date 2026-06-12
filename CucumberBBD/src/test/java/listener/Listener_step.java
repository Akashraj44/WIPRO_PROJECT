package listener;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Hooks.HookS;

public class Listener_step extends TestWatcher {

@Override
protected void starting(
Description description) {

System.out.println(
"STARTING : "
+ description.getMethodName());
}

@Override
protected void succeeded(
Description description) {

System.out.println(
"PASSED : "
+ description.getMethodName());
}
@Override
protected void failed(Throwable e, Description description) {

System.out.println("FAILED : "+description.getMethodName());

try {

File src=((TakesScreenshot)HookS.driver).getScreenshotAs(OutputType.FILE);

File dest=new File("screenshots/"+description.getMethodName()+".png");

FileUtils.copyFile(src,dest);

System.out.println("Screenshot Saved");

}

catch(IOException ex){

ex.printStackTrace();

}

}

@Override
protected void finished(
Description description) {

System.out.println(
"FINISHED : "
+ description.getMethodName());
}
}