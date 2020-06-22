package Execution;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.AppDriver;
import Modules.SampleGoogle;

public class ExecuteSampleGoogle extends AppDriver 
{
    @Test
    public void Samplegen() throws IOException, InterruptedException 
    {
    	SampleGoogle sgobj = new SampleGoogle();
    	String urlexcelpath =  "D:\\Software\\Database_2020\\db shop database\\All India General\\Create_Sample\\";
    	String urlexcelname = "gulbargurl";
    	sgobj.createurlexcel(urlexcelpath, urlexcelname);
    	driver.navigate().to("https://www.google.com/search?tbm=lcl&ei=9xIIXK3rBNey9QPIl6fIBA&q=furniture+dealer&oq=furniture+dealer&gs_l=psy-ab.3..35i39k1j0l9.1603425.1614009.0.1614899.16.16.0.0.0.0.247.2142.0j15j1.16.0....0...1c.1.64.psy-ab..0.16.2137...0i131k1j0i67k1.0.GAisbOSxAYE#rlfi=hd:;si:;mv:!1m2!1d28.667845699999997!2d77.4001945!2m2!1d28.5082693!2d77.1836514;tbs:lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:10");
		Thread.sleep(30000);
		String citypath = "D:\\Software\\Database_2020\\db shop database\\All India General\\Create_Sample\\city_input.xlsx";
		String categorypath = "D:\\Software\\Database_2020\\db shop database\\All India General\\Create_Sample\\category.xlsx";
		sgobj.fetchurl(citypath, categorypath);
		sgobj.CreatedbExcel("D:\\Software\\Database_2020\\db shop database\\All India General\\Create_Sample\\", "gulbargdata");
		sgobj.fetchdata(urlexcelpath, urlexcelname);
    }
}
