import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_Login {

    public AndroidDriver<MobileElement> driver;

    public void main(String[] args){

    }

    @Test
    public void TestDriver() throws MalformedURLException {
        DesiredCapabilities cab= new DesiredCapabilities();
        cab.setCapability(MobileCapabilityType.PLATFORM, "Android");
        cab.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID-52");
        cab.setCapability(MobileCapabilityType.VERSION, "7.1.2 N2G47H");
        cab.setCapability("appPackage", " com.epcl.qa");
        cab.setCapability("appActivity", "com.epcl.MainActivity");
        cab.setCapability(MobileCapabilityType.NO_RESET, "True");
        cab.setCapability(MobileCapabilityType.UDID, "6a46c6767d34");
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cab);
    }
}