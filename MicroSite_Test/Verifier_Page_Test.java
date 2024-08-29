package MicroSite_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Verifier_Page_Test extends Verifier_Login_Test {

	@Test(priority = 2)
	public void Verifier_Page_Test() throws Exception {
		FileInputStream fis = new FileInputStream(projectPath + "/src/test/java/MicroSite_Data/Verifier_Data");
		Properties p = new Properties();
		p.load(fis);

		MicroSite_Page_Objects.Verifier_Page vp = new MicroSite_Page_Objects.Verifier_Page(driver);
		vp.Select(p.getProperty("Campaign"));
		vp.Search();
		vp.Link();
		vp.Next();
//		vp.Approve();
	}
}
