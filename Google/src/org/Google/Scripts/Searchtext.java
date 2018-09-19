package org.Google.Scripts;

import org.Google.DriverInitiate.Base;
import org.Google.Pages.Search;
import org.Google.Utility.Utility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Searchtext extends Base {


	@Test
	public void test() throws Exception 
	{
		Search sh=new Search(driver);
		sh.searchfield(Utility.getlocator("Search_Text"), "Most visited place in Delhi");
		sh.click(Utility.getlocator("SearchButton"));
		sh.link(Utility.getlocator("Link"));
}
           
}
