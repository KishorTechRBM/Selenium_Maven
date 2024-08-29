package ReadConfigFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigFile {
	String projectPath = System.getProperty("user.dir");
	
	public void ReadConfig() throws Exception {
		FileInputStream Login_Data = new FileInputStream(projectPath+"/src/test/java/MicroSite_Data/Login_Data");
		FileInputStream Verifier_Data = new FileInputStream(projectPath + "/src/test/java/MicroSite_Data/Verifier_Data");
		Properties p = new Properties();
		p.load(Login_Data);
		p.load(Verifier_Data);
	}

}
