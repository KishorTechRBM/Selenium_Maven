package MicroSite_Test;

import org.testng.annotations.Test;

public class Payment_Page_Test extends Enrollment_Page_Test {
  @Test
  public void Payment_Page() throws Exception {
	  MicroSite_Page_Objects.Payment_Page pp = new MicroSite_Page_Objects.Payment_Page(driver);
	  pp.Payment_Form();
  }
}
