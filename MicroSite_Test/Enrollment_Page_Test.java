package MicroSite_Test;

import org.testng.annotations.Test;

public class Enrollment_Page_Test extends Agent_Login_Test {
	
  @Test (priority = 2)
  public void Enrollment_Page() throws Exception {
	  MicroSite_Page_Objects.Enrollment_Page ep = new MicroSite_Page_Objects.Enrollment_Page(driver);
	  ep.Enrollment_Form();
  }
}
